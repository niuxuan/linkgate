package com.angogo.ht.linkgate.service.link.impl;

import com.angogo.ht.linkgate.mapper.LinkMapper;
import com.angogo.ht.linkgate.model.LinkMapping;
import com.angogo.ht.linkgate.model.conf.siteconf;
import com.angogo.ht.linkgate.service.link.LinkService;
import com.angogo.ht.linkgate.util.LinkHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service(value = "linkService")
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkMapper linkMapper;

    @Autowired
    private siteconf conf;

    @Value("${siteconf.redirect}")
    private String redirectSite;

    @Override
    public String addLink(LinkMapping link) {
        String code = "";

        //根据业务类型获取对应域名
        String shortUrl =conf.getBizlist().get(link.getBizGroup());

        //查询链接是否已存在
        String longUrl = link.getUrl();
        LinkMapping link1 = linkMapper.selectByUrl(longUrl);

        if(link1 == null) {
            //生成唯一code
            code = LinkHelper.gererateShortUrl(longUrl);

            link.setCode(code);
            link.setCreateTime(new Timestamp(System.currentTimeMillis()));

            linkMapper.insert(link);
        }else{
            code = link1.getCode();
        }
        return shortUrl+code;
    }

    //为code查询增加springboot自带缓存
    @Cacheable(key="#code",value="LinkMapping")
    @Override
    public LinkMapping findLink(String code) {
        System.out.println(code);
        return linkMapper.selectByCode(code);
    }
}

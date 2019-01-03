package com.angogo.ht.linkgate.controller;

import com.angogo.ht.linkgate.model.LinkMapping;
import com.angogo.ht.linkgate.service.link.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class LinkController {
    @Autowired
    private LinkService linkService;

    @Value("${siteconf.redirect}")
    private String redirectSite;

    @RequestMapping(value = "/{code}", produces = {"application/json;charset=UTF-8"})
    public Object findLink(@PathVariable("code") String code) {
        //1.读取映射
        LinkMapping link = linkService.findLink(code);

        if (link != null && !"".equals(link.getUrl())) {

            //2.执行安全域名验证

            //3.接收附加参数，进行数据统计

            //4.完成转发
            return "redirect:" + link.getUrl();
        } else {

            return "redirect:" + redirectSite;
        }
    }
}

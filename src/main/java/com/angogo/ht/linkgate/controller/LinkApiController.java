package com.angogo.ht.linkgate.controller;

import com.angogo.ht.linkgate.model.LinkMapping;
import com.angogo.ht.linkgate.service.link.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/linkapi")
public class LinkApiController {
    @Autowired
    private LinkService linkService;

    @ResponseBody
    @GetMapping("/add")
    public String addLink(LinkMapping url){
        //验证参数
        if (url == null || "".equals(url.getUrl())){
            return null;
        }

        //验证链接
        if(url.getUrl().startsWith("http://") || url.getUrl().startsWith("https://")){
            return  linkService.addLink(url);
        }else{
            return "链接地址必须以http或https开头";
        }
    }
}

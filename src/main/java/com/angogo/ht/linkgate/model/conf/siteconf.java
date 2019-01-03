package com.angogo.ht.linkgate.model.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
 * yaml配置文件映射类
 */
@Component
@ConfigurationProperties(ignoreUnknownFields = false, prefix="siteconf")
public class siteconf {

    private String redirect;

    private List<String> bizlist = new ArrayList<>();

    public List<String> getBizlist(){
        return bizlist;
    }

    public String getRedirect()
    {
        return redirect;
    }

    public void setRedirect(String redirect)
    {
        this.redirect = redirect;
    }

    public void setBizlist(List<String> bizlist)
    {
        this.bizlist = bizlist;
    }
}

package com.angogo.ht.linkgate.model;


import java.sql.Timestamp;

public class LinkMapping {
    private Integer id;

    private String url;

    private String code;

    private Integer bizGroup;

    private String tag;

    private Timestamp createTime;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag(String tag)
    {
        this.tag = tag;
    }

    public Integer getBizGroup()
    {
        return bizGroup;
    }

    public void setBizGroup(Integer bizGroup)
    {
        this.bizGroup = bizGroup;
    }

    public Timestamp getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime)
    {
        this.createTime = createTime;
    }
}

package com.angogo.ht.linkgate.mapper;

import com.angogo.ht.linkgate.model.LinkMapping;

public interface LinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LinkMapping record);

    LinkMapping selectByPrimaryKey(Integer id);

    LinkMapping selectByCode(String code);

    LinkMapping selectByUrl(String Url);

    int updateByPrimaryKey(LinkMapping record);
}

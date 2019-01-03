package com.angogo.ht.linkgate.service.link;

import com.angogo.ht.linkgate.model.LinkMapping;

public interface LinkService {
    String addLink(LinkMapping link);

    LinkMapping findLink(String code);
}

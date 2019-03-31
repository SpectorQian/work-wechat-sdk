package com.kuaicto.work.wechat.sdk.model.tag;

import java.io.Serializable;
import java.util.List;

/**
 * @author Spector
 * @Title: TagList
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2111:12
 */
public class TagList implements Serializable {
    private List<Tag> taglist;

    public List<Tag> getTaglist() {
        return taglist;
    }

    public void setTaglist(List<Tag> taglist) {
        this.taglist = taglist;
    }
}

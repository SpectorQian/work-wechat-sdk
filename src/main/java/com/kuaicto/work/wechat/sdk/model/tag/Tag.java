package com.kuaicto.work.wechat.sdk.model.tag;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author Spector
 * @Title: Tag
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2110:55
 */
public class Tag implements Serializable {

    @JSONField(name = "tagid")
    private Long tagId;

    @JSONField(name = "tagname")
    private String tagName;

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                '}';
    }
}

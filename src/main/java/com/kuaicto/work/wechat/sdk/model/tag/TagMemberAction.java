package com.kuaicto.work.wechat.sdk.model.tag;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * @author Spector
 * @Title: TagMemberAction
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2112:49
 */
public class TagMemberAction implements Serializable {
    /**
     * 标签ID
     */
    @JSONField(name = "tagid")
    private Long tagId;

    /**
     * 企业成员ID列表
     */
    @JSONField(name = "userlist")
    private List<String> memberIdList;

    /**
     * 企业部门ID列表
     */
    @JSONField(name = "partylist")
    private List<Long> departmentIdList;

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public List<String> getMemberIdList() {
        return memberIdList;
    }

    public void setMemberIdList(List<String> memberIdList) {
        this.memberIdList = memberIdList;
    }

    public List<Long> getDepartmentIdList() {
        return departmentIdList;
    }

    public void setDepartmentIdList(List<Long> departmentIdList) {
        this.departmentIdList = departmentIdList;
    }

    @Override
    public String toString() {
        return "TagMemberAction{" +
                "tagId=" + tagId +
                ", memberIdList=" + memberIdList +
                ", departmentIdList=" + departmentIdList +
                '}';
    }
}

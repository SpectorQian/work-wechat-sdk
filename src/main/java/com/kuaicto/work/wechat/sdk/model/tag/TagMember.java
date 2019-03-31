package com.kuaicto.work.wechat.sdk.model.tag;

import com.alibaba.fastjson.annotation.JSONField;
import com.kuaicto.work.wechat.sdk.model.member.SimpleMember;

import java.io.Serializable;
import java.util.List;

/**
 * @author Spector
 * @Title: TagMember
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2111:23
 */
public class TagMember implements Serializable {
    /**
     * 标签名
     */
    @JSONField(name = "tagname")
    private String tagName;

    /**
     * 标签中包含的成员列表
     */
    @JSONField(name = "userlist")
    private List<SimpleMember> memberList;

    /**
     * 标签中包含的部门id列表
     */
    @JSONField(name = "partylist")
    private List<Long> departmentIdList;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<SimpleMember> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<SimpleMember> memberList) {
        this.memberList = memberList;
    }

    public List<Long> getDepartmentIdList() {
        return departmentIdList;
    }

    public void setDepartmentIdList(List<Long> departmentIdList) {
        this.departmentIdList = departmentIdList;
    }

    @Override
    public String toString() {
        return "TagMember{" +
                "tagName='" + tagName + '\'' +
                ", memberList=" + memberList +
                ", departmentIdList=" + departmentIdList +
                '}';
    }
}

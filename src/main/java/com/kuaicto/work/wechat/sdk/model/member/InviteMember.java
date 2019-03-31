package com.kuaicto.work.wechat.sdk.model.member;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * @author Spector
 * @Title: InviteMember
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/7/1217:59
 */
public class InviteMember implements Serializable {

    private static final long serialVersionUID = 2475420505844103301L;
    /**
     * 成员ID列表, 最多支持1000个。
     */
    @JSONField(name = "user")
    private List<String> memberIdList;

    /**
     * 部门ID列表，最多支持100个。
     */
    @JSONField(name = "party")
    private List<Long> departmentIdList;

    /**
     * 标签ID列表，最多支持100个。
     */
    @JSONField(name = "tag")
    private List<Long> tagIdList;

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

    public List<Long> getTagIdList() {
        return tagIdList;
    }

    public void setTagIdList(List<Long> tagIdList) {
        this.tagIdList = tagIdList;
    }

    @Override
    public String toString() {
        return "InviteMember{" +
                "memberIdList=" + memberIdList +
                ", departmentIdList=" + departmentIdList +
                ", tagIdList=" + tagIdList +
                '}';
    }
}

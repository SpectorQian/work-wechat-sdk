package com.kuaicto.work.wechat.sdk.model.member;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * @author Spector
 */
public class MemberDelete implements Serializable {

    private static final long serialVersionUID = 4900280377557232656L;
    @JSONField(name = "useridlist")
    private List<String> memberIdList;

    public List<String> getMemberIdList() {
        return memberIdList;
    }

    public void setMemberIdList(List<String> memberIdList) {
        this.memberIdList = memberIdList;
    }
}

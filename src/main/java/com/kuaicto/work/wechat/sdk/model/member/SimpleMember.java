package com.kuaicto.work.wechat.sdk.model.member;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author Spector
 */
public class SimpleMember implements Serializable {
    @JSONField(name = "userid")
    private String memberId;

    /**
     * 成员名称。长度为1~64个字符
     */
    @JSONField(name = "name")
    private String userName;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "SimpleMember{" +
                "memberId='" + memberId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

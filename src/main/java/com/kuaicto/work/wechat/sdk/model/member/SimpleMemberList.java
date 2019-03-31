package com.kuaicto.work.wechat.sdk.model.member;

import java.io.Serializable;
import java.util.List;

public class SimpleMemberList implements Serializable {

    private List<SimpleMember> userlist;

    public List<SimpleMember> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<SimpleMember> userlist) {
        this.userlist = userlist;
    }
}

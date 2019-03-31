package com.kuaicto.work.wechat.sdk.core;

public class WorkWechatBuilder {

    private WorkWechat workWechat;

    private WorkWechatBuilder() {
    }


    public static WorkWechat builder(String accessToken){
        return new WorkWechat(accessToken);
    }

    public static WorkWechat builder(String corpId, String corpSecret){
        return new WorkWechat(corpId, corpSecret);
    }

    public WorkWechat build(){
        return workWechat;
    }
}

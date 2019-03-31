package com.kuaicto.work.wechat.sdk.model.accesstoken;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author Spector
 * @Title: AccessToken
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2113:48
 */
public class AccessToken implements Serializable {
    @JSONField(name = "access_token")
    private String accessToken;

    @JSONField(name = "expires_in")
    private Integer expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "AccessToken{" +
                "accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }
}

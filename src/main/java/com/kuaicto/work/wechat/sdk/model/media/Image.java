package com.kuaicto.work.wechat.sdk.model.media;

import java.io.Serializable;

/**
 * @author Spector
 * @Title: Image
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/7/1114:09
 */
public class Image implements Serializable {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

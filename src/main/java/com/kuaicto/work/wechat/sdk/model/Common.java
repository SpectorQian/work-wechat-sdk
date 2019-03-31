package com.kuaicto.work.wechat.sdk.model;

import java.io.Serializable;

/**
 * @author Spector
 * @Title: Common
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2018:27
 */
public class Common implements Serializable {
    private Integer errcode;
    private String errmsg;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}

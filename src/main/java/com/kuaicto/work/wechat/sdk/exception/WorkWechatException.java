package com.kuaicto.work.wechat.sdk.exception;

/**
 * @author Spector
 * @Title: WorkWechatException
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2110:12
 */
public class WorkWechatException extends Exception {

    private Integer errorCode;

    private String errorMessage;

    public WorkWechatException(Throwable cause) {
        super(cause);
    }

    public WorkWechatException(Integer errorCode, String errorMessage) {
        super("[errorCode: " + errorCode + ", errorMessage: " + errorMessage + "]");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}

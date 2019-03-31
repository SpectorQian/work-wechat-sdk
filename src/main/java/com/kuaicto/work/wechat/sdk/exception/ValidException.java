package com.kuaicto.work.wechat.sdk.exception;

/**
 * @author Spector
 * @Title: ValidException
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2113:36
 */
public class ValidException extends WorkWechatException {

    public ValidException(Integer code, String message) {
        super(code, message);
    }

    public ValidException(Throwable cause) {
        super(cause);
    }
}

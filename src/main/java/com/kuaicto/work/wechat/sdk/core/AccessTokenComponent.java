package com.kuaicto.work.wechat.sdk.core;

import com.kuaicto.work.wechat.sdk.exception.ValidException;
import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.accesstoken.AccessToken;

/**
 * @author Spector
 * @Title: AccessTokenComponent
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2113:41
 */
public class AccessTokenComponent extends AbstractComponents {

    private WorkWechat workWechat;

    /**
     * accessToken请求地址
     */
    private static final String GET_ACCESS_TOKEN = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRECT";

    public AccessTokenComponent(WorkWechat workWechat) {
        super(workWechat);
        this.workWechat = workWechat;
    }

    public AccessToken getAccessToken() throws WorkWechatException {
        validAccessTokenParam();

        String url = GET_ACCESS_TOKEN.replaceAll("ID", workWechat.getCorpId())
                .replaceAll("SECRECT", workWechat.getCorpSecret());
        return httpGet(url, null, AccessToken.class);
    }

    private void validAccessTokenParam() throws ValidException {
        boolean valid = workWechat == null
                || workWechat.getCorpId() == null || workWechat.getCorpId().length() == 0
                || workWechat.getCorpSecret() == null || workWechat.getCorpSecret().length() == 0;
        if(valid){
            throw new ValidException(-1, "企业ID或者凭证密钥不存在");
        }
    }

}

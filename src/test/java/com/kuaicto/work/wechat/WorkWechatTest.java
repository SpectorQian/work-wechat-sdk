package com.kuaicto.work.wechat;

import com.kuaicto.work.wechat.sdk.core.WorkWechat;
import com.kuaicto.work.wechat.sdk.core.WorkWechatBuilder;
import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.accesstoken.AccessToken;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Spector
 * @Title: com.kuaicto.work.wechat.WorkWechatTest
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/21 11:02
 */
public class WorkWechatTest {

    private WorkWechat wechat;

    @Before
    public void init(){
        String accessToken = "yQ4-OASFoYfUjJb2JHffAF7P8O3elDeF8CcjNq3TWr3T331U0lK52XEtcOq-UPHCfnTaLLndB3wnJBaQQomSf7sqUd6wne2kHyofz4jOfsgA1jH5ab-fizoqna8dyyC6fw7F4FNMRpO-8DNVu6_amA6kgKEVAYT-xI5EybZqBUUYLM4XaEFlytf5wardgd1SoSsw2W7Fr7Wsllm5_2nZ5A";
        wechat = WorkWechatBuilder.builder(accessToken);

//        wechat = WorkWechatBuilder.builder("ww51f472fd383b379c", "t3jRWf");
    }

    WorkWechat builder(){
        return this.wechat;
    }

    @Test
    public void getAccessToken() throws WorkWechatException {
        AccessToken accessToken = wechat.getAccessTokens().getAccessToken();
        System.out.println(accessToken);
    }
}

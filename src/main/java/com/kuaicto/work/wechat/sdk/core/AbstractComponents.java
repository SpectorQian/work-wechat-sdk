package com.kuaicto.work.wechat.sdk.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.Common;
import jodd.http.HttpRequest;

import java.io.File;
import java.util.Map;

/**
 * @Description: 抽象的组件基类
 *
 * @author Spector
 * @date 2018/6/20 18:10
 */
public abstract class AbstractComponents {

    private WorkWechat workWechat;

    public AbstractComponents(WorkWechat workWechat) {
        this.workWechat = workWechat;
    }

    String accessToken(){
        return workWechat.getAccessToken();
    }

    void httpPost(String url, Object body) throws WorkWechatException {
        httpPost(url, body, null);
    }

    <T> T httpPost(String url, Object body, Class<T> clazz) throws WorkWechatException {
        System.out.println(JSON.toJSONString(body));
        String respBody = HttpRequest.post(url)
                .bodyText(JSON.toJSONString(body), "application/json", "utf-8").send().bodyText();

        validResponse(respBody);

        if(clazz == null){
            return null;
        }
        System.out.println(respBody);
        return JSON.parseObject(respBody, clazz);
    }

    <T> T httpGet(String url, Map<String, String> paramMap, Class<T> clazz) throws WorkWechatException {
        HttpRequest request = HttpRequest.get(url);
        if(paramMap != null && !paramMap.isEmpty()){
            request.query(paramMap);
        }

        String respBody = request.send().bodyText();
        validResponse(respBody);

        if(Common.class.equals(clazz)){
            return null;
        }
        return JSON.parseObject(respBody, clazz);
    }

    <T> T httpUpload(String url, File file, String contentType, Class<T> clazz) throws WorkWechatException {
        String respBody = HttpRequest.post(url)
                .form("file", file)
                .contentType(contentType).send().bodyText();

        validResponse(respBody);
        return JSON.parseObject(respBody, clazz);
    }

    String httpDownload(String url){
        return HttpRequest.get(url).send().body();
    }

    /**
     * 验证提交结果
     * @param responseBody
     */
    private void validResponse(String responseBody) throws WorkWechatException {
        JSONObject responseJson = JSON.parseObject(responseBody);
        if(responseJson == null || !responseJson.containsKey("errcode")){
            throw new WorkWechatException(-1, "提交无响应");
        }

        Integer errorCode = responseJson.getInteger("errcode");
        if(errorCode == 0){
            return;
        }

        String errorMsg = responseJson.getString("errmsg");
        throw new WorkWechatException(errorCode, errorMsg);
    }
}

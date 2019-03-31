package com.kuaicto.work.wechat.sdk.serialize;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.kuaicto.work.wechat.sdk.enums.EnumActivationStatus;

import java.lang.reflect.Type;

/**
 * @author Spector
 * @Title: ActivationStatusDeserializer
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/7/1014:34
 */
public class ActivationStatusDeserializer implements ObjectDeserializer {
    @Override
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object o) {
        Integer code = defaultJSONParser.parseObject(Integer.class);
        return (T) EnumActivationStatus.codeOf(code);
    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}

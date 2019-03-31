package com.kuaicto.work.wechat.sdk.serialize;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.kuaicto.work.wechat.sdk.enums.EnumGenderType;

import java.lang.reflect.Type;

/**
 * @author Spector
 */
public class GenderTypeDeSerializer implements ObjectDeserializer {

    @Override
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object o) {
        String gender = defaultJSONParser.parseObject(String.class);
        return (T) EnumGenderType.typeOf(gender);
    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}

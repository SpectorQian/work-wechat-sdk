package com.kuaicto.work.wechat.sdk.serialize;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.kuaicto.work.wechat.sdk.enums.BooleanType;

import java.lang.reflect.Type;

/**
 * @author Spector
 */
public class BooleanTypeDeSerializer implements ObjectDeserializer {

    @Override
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object o) {
        Integer i = defaultJSONParser.parseObject(int.class);
        return (T) BooleanType.typeOf(i);
    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }

}

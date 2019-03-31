package com.kuaicto.work.wechat.sdk.serialize;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.kuaicto.work.wechat.sdk.enums.BooleanType;

import java.lang.reflect.Type;

/**
 * @author Spector
 */
public class BooleanTypeSerializer implements ObjectSerializer {

    @Override
    public void write(JSONSerializer jsonSerializer, Object o, Object o1, Type type, int i) {
        jsonSerializer.out.writeInt(BooleanType.codeByValue((Boolean) o));
    }
}

package com.kuaicto.work.wechat.sdk.serialize;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.kuaicto.work.wechat.sdk.enums.EnumActivationStatus;

import java.lang.reflect.Type;

/**
 * @author Spector
 * @Title: ActivationStatusSerializer
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/7/1317:00
 */
public class ActivationStatusSerializer implements ObjectSerializer {

    @Override
    public void write(JSONSerializer jsonSerializer, Object o, Object o1, Type type, int i) {
        jsonSerializer.out.writeInt(EnumActivationStatus.codeByName((String) o));
    }
}

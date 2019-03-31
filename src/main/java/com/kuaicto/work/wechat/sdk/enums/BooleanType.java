package com.kuaicto.work.wechat.sdk.enums;

public enum BooleanType {
    TRUE(1, true),
    FALSE(0, false);

    private int code;

    private boolean value;

    BooleanType(int type, boolean value) {
        this.code = type;
        this.value = value;
    }

    public static Boolean typeOf(int type){
        for (BooleanType booleanType : values()) {
            if(booleanType.code == type){
                return booleanType.value;
            }
        }

        throw new IllegalArgumentException("unknown boolean code : " + type);
    }

    public static int codeByValue(boolean value){
        for (BooleanType booleanType : values()) {
            if(booleanType.value == value){
                return booleanType.code;
            }
        }

        return BooleanType.TRUE.code;
    }
}

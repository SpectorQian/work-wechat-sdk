package com.kuaicto.work.wechat.sdk.enums;

public enum EnumActivationStatus {
    ACTIVATED(1, "已激活"),
    DISABLED(2, "已禁用"),
    INACTIVE(4, "未激活");

    private Integer code;
    private String value;

    EnumActivationStatus(Integer code, String lable) {
        this.code = code;
        this.value = lable;
    }

    public String getValue() {
        return this.value;
    }

    public Integer getCode() {
        return this.code;
    }

    public static String codeOf(Integer code){
        for (EnumActivationStatus value : values()) {
            if(value.getCode().equals(code)){
                return value.name();
            }
        }

        return EnumActivationStatus.INACTIVE.name();
    }

    public static String nameOf(String name){
        for (EnumActivationStatus value : values()) {
            if(value.name().equals(name)){
                return value.name();
            }
        }

        return EnumActivationStatus.INACTIVE.name();
    }


    public static int codeByName(String name){
        for (EnumActivationStatus value : values()) {
            if(value.name().equals(name)){
                return value.getCode();
            }
        }

        return EnumActivationStatus.INACTIVE.getCode();
    }
}

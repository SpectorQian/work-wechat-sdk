package com.kuaicto.work.wechat.sdk.enums;

public enum EnumGenderType {
    MALE("1", "男"),
    FEMALE("2", "女"),
    UNKNOWN("0", "未知");

    private String code;
    private String value;

    EnumGenderType(String type, String gender) {
        this.code = type;
        this.value = gender;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static String typeOf(String type){
        for (EnumGenderType value : values()) {
            if(value.getCode().equals(type)){
                return value.name();
            }
        }

        return EnumGenderType.UNKNOWN.name();
    }

    public static String nameOf(String name){
        for (EnumGenderType value : values()) {
            if(value.name().equals(name)){
                return value.name();
            }
        }

        return EnumGenderType.UNKNOWN.name();
    }

    public static String codeByName(String name){
        for (EnumGenderType value : values()) {
            if(value.name().equals(name)){
                return value.getCode();
            }
        }

        return EnumGenderType.UNKNOWN.getCode();
    }
}

package com.scut.demo.utils;

/**
 * enum 指枚举类
 */
public enum ResultCodeEnum {

    SUCCESS(200, "请求成功"),
    ERROR(400, "请求失败"),
    RUN_TOOL_ERROR(401, "请求其他工具出错"),
    RUN_TOOL_SUCCESS(402, "请求其他工具成功");

    private int code;
    private String msg;

    ResultCodeEnum(){}

    ResultCodeEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

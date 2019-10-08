package com.zfc.common.exception;
/**
 * @Author zufeichao
 * @Description //TODO
 * @Date 14:35 2019/10/8
 **/
public enum ResultEnum {

    SUCCESS("200","success"),

    REGISTER_USER_EXIST("100002","用户已存在"),

    AUTH_TOKEN_NOT_FOUND("200001", "token不能为空！"),

    AUTH_NOT_LOGIN("402", "用户未登录，请登录！"),

    AUTH_UNAUTHORIZED("401", "token失效，请重新登录！"),

    PARAM_TENANT_NOT_FOUND("200002", "tenantId不能为空！"),

    PARAM_BAD_PARAM("400", "请求参数有误!"),

    URL_INVALID("200003", "该邀请链接已失效！"),

    UNKNOWN_ERROR("500", "系统出异常啦!请联系管理员!!!"),

    INTERFACE_ERROR("100001", "外系统接口异常!请联系管理员!!!"),

    COMMON("100000", "");

    private String code;

    private String msg;

    private ResultEnum(String code ,String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}

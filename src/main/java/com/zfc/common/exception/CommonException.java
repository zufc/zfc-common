package com.zfc.common.exception;

import java.io.Serializable;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description 统一异常处理
 * @Date 2019-10-08 14:40
 * @T: CommonException
 **/
public class CommonException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -6077179433386972346L;


    public String code;

    public String msg ;

    private CommonException() {
    }

    public CommonException(String code,String msg) {
        super(msg);
        this.code = code;
        this.msg = msg ;
    }

    public CommonException(String msg) {
        super(msg);
        this.code = ResultEnum.UNKNOWN_ERROR.getCode();
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

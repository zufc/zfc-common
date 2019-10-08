package com.zfc.common.exception;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:43
 * @T: AuthException
 **/
public class AuthException extends CommonException {

    public AuthException(String code, String msg) {
        super(code, msg);
    }

    public AuthException(String msg) {
        super(msg);
    }
}

package com.zfc.common.exception;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:44
 * @T: BusinessException
 **/
public class BusinessException extends CommonException {
    public BusinessException(String code, String msg) {
        super(code, msg);
    }

    public BusinessException(String msg) {
        super(msg);
        this.msg = msg;
        this.code = ResultEnum.UNKNOWN_ERROR.getCode();
    }
}

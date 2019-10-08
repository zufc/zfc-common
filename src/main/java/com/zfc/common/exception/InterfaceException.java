package com.zfc.common.exception;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:47
 * @T: InterfaceException
 **/
public class InterfaceException extends CommonException {

    public InterfaceException(String message){

        super(message);

        this.msg = message;

        this.code = ResultEnum.INTERFACE_ERROR.getCode();
    }
}

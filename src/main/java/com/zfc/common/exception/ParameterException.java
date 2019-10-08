package com.zfc.common.exception;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:48
 * @T: ParameterException
 **/
public class ParameterException extends  CommonException {

    public ParameterException(String message){

        super(message);

        this.msg = message;

        this.code = ResultEnum.PARAM_BAD_PARAM.getCode();
    }
}

package com.zfc.common.base.dto;

import com.zfc.common.constant.RpcResultCode;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:17
 * @T: RpcResponseDtoUtil
 **/
public class RpcResponseDtoUtil {

    /**
     * 创建RPC接口返回参数
     * @param obj
     * @return
     */
    public static BaseResponseDto createResponseDto(Object obj){
        BaseResponseDto result = new BaseResponseDto();
        result.setData(obj);
        return result;
    }

    /**
     * 创建错误返回
     * @param code
     * @param message
     * @return
     */
    public static BaseResponseDto createErrorResponseDto(String code, String message){
        BaseResponseDto result = new BaseResponseDto();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    /**
     * 创建错误返回
     * @param message
     * @return
     */
    public static  BaseResponseDto createErrorResponseDto(String message){

        BaseResponseDto result = new BaseResponseDto()  ;
        result.setSuccess(false);
        result.setCode(RpcResultCode.BUSINESS_ERROR_CODE);
        result.setMessage(message);
        return  result;
    }
}

package com.zfc.common.base.dto;

import com.alibaba.fastjson.JSONObject;
import com.zfc.common.constant.ResultCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:10
 * @T: BaseResponseDto
 **/
@Data
public class BaseResponseDto<T> implements Serializable {
    private static final long serialVersionUID = 5798176565484065994L;

    /**
     * 信息
     */
    private String message = "操作成功";
    /**
     * 返回数据
     */
    private T data;

    /**
     * 是否成功 标志
     */
    private boolean success = true;

    /**
     * 返回编码
     */
    private String code = ResultCode.SUCCESS;


    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}

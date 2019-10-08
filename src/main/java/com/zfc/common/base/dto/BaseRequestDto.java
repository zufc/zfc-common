package com.zfc.common.base.dto;

import com.alibaba.fastjson.JSONObject;
import com.zfc.common.base.login.BaseLogin;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 11:50
 * @T: BaseRequestDto
 **/
@Data
public class BaseRequestDto<T> implements Serializable {
    private static final long serialVersionUID = 5908925210305902204L;

    /**
     * 登录信息
     **/
    private BaseLogin loginInfo;

    /**
     * 请求数据
     **/
    private T request;

    public BaseRequestDto() {
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}

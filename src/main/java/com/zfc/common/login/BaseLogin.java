package com.zfc.common.login;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 15:22
 * @T: BaseLogin
 **/
@Data
public class BaseLogin implements Serializable {

    /**
     *当前登录用户
     **/
    private String userId ;

    /**
     *当前登录用户
     **/
    private String userName ;


    /**
     *当前登录token
     **/
    private String accessToken ;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}

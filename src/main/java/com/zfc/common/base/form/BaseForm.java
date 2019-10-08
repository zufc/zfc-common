package com.zfc.common.base.form;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:23
 * @T: BaseForm
 **/
@Data
public class BaseForm implements Serializable {

    private static final long serialVersionUID = -4539864518181103232L;

    /**
     *当前登录用户id
     **/
    private String userId;
    /**
     *当前登录用户名称
     **/
    private String userName;

    /**
     *当前登录token
     **/
    private String token ;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }


}

package com.zfc.common.base.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:31
 * @T: BaseQuery
 **/
@Data
public class BaseQuery implements Serializable {
    private static final long serialVersionUID = -5791069963678292604L;


    private static final String ASC = "ASC";

    private static final String DESC = "DESC";

    /**
     * 查询分页页码
     */
    private Integer page = 1;

    /**
     * 查询分页一页查询展示数据
     */
    private Integer pageSize = 50;
}

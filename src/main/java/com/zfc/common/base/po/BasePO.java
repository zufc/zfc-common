package com.zfc.common.base.po;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 14:32
 * @T: BasePO
 **/
@Data
public class BasePO implements Serializable {
    private static final long serialVersionUID = 6138355128781998878L;
    /**
     *租户ID
     **/
    private String tenantId;
    /**
     *创建人id
     **/
    private String creatorId;
    /**
     *创建人名称
     **/
    private String createdBy;
    /**
     *创建时间
     **/
    private LocalDateTime createdAt;
    /**
     *修改人ID
     **/
    private String modifierId;
    /**
     *修改人
     **/
    private String updatedBy;
    /**
     *修改时间
     **/
    private LocalDateTime updatedAt;
    /**
     *是否删除
     **/
    private Integer dr;
}

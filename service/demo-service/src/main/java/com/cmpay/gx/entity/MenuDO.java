/*
 * @ClassName MenuDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 14:20:00
 */
package com.cmpay.gx.entity;


import com.cmpay.gx.dao.BaseDO;
import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.lemon.framework.data.DOBasicOperation;
import lombok.Data;

import java.time.LocalDate;
@Data
@DataObject
public class MenuDO extends BaseDO implements DOBasicOperation {
    /**
     * @Fields id
     */
    private Long id;
    /**
     * @Fields id
     */
    private Long uId;
    /**
     * @Fields id
     */
    private Long rid;
    /**
     * @Fields createBy
     */
    private String createBy;
    /**
     * @Fields createDate
     */
    private LocalDate createDate;
    /**
     * @Fields updateBy
     */
    private String updateBy;
    /**
     * @Fields updateDate
     */
    private LocalDate updateDate;
    /**
     * @Fields isUse
     */
    private Byte isUse;


}
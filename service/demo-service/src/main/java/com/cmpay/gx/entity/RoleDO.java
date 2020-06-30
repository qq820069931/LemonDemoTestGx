/*
 * @ClassName RoleDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-22 08:49:32
 */
package com.cmpay.gx.entity;

import com.cmpay.gx.dao.BaseDO;
import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.lemon.framework.data.DOBasicOperation;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
@Data
@DataObject
public class RoleDO extends BaseDO implements DOBasicOperation {
    /**
     * @Fields id
     */
    private Long id;
    /**
     * @Fields name
     */
    private String name;
    /**
     * @Fields remarks
     */
    private String remarks;
    /**
     * @Fields action
     */
    private String action;
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
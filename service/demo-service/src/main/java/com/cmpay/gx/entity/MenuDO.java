/*
 * @ClassName MenuDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-22 09:40:22
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
public class MenuDO extends BaseDO implements DOBasicOperation {
    /**
     * @Fields tId 
     */
    private Long id;
    /**
     * @Fields tType 
     */
    private String type;
    /**
     * @Fields tSuperior 
     */
    private Long superior;
    /**
     * @Fields tName 
     */
    private String name;
    /**
     * @Fields tMeta 
     */
    private String meta;
    /**
     * @Fields tComponent 
     */
    private String component;
    /**
     * @Fields tUrl 
     */
    private String url;
    /**
     * @Fields tEname 
     */
    private String ename;
    /**
     * @Fields tIdentification 
     */
    private String identification;
    /**
     * @Fields createBy 
     */
    private String createBy;
    /**
     * @Fields createDate 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate createDate;
    /**
     * @Fields updateBy 
     */
    private String updateBy;
    /**
     * @Fields updateDate 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate updateDate;
    /**
     * @Fields isUse 
     */
    private Byte isUse;


}
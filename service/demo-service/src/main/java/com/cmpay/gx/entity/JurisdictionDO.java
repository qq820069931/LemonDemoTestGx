/*
 * @ClassName JurisdictionDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-22 08:49:32
 */
package com.cmpay.gx.entity;

import com.cmpay.gx.dao.BaseDO;
import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.lemon.framework.data.DOBasicOperation;

import java.time.LocalDate;

@DataObject
public class JurisdictionDO extends BaseDO implements DOBasicOperation {
    /**
     * @Fields tId 
     */
    private Long tId;
    /**
     * @Fields tAction 
     */
    private String tAction;
    /**
     * @Fields tType 
     */
    private Byte tType;
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

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public String gettAction() {
        return tAction;
    }

    public void settAction(String tAction) {
        this.tAction = tAction;
    }

    public Byte gettType() {
        return tType;
    }

    public void settType(Byte tType) {
        this.tType = tType;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public Byte getIsUse() {
        return isUse;
    }

    public void setIsUse(Byte isUse) {
        this.isUse = isUse;
    }
}
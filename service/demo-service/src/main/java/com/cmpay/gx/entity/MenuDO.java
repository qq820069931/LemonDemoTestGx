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

import java.time.LocalDate;

@DataObject
public class MenuDO extends BaseDO implements DOBasicOperation {
    /**
     * @Fields tId 
     */
    private Long tId;
    /**
     * @Fields tType 
     */
    private String tType;
    /**
     * @Fields tSuperior 
     */
    private Long tSuperior;
    /**
     * @Fields tName 
     */
    private String tName;
    /**
     * @Fields tMeta 
     */
    private String tMeta;
    /**
     * @Fields tComponent 
     */
    private String tComponent;
    /**
     * @Fields tUrl 
     */
    private String tUrl;
    /**
     * @Fields tEname 
     */
    private String tEname;
    /**
     * @Fields tIdentification 
     */
    private String tIdentification;
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

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }

    public Long gettSuperior() {
        return tSuperior;
    }

    public void settSuperior(Long tSuperior) {
        this.tSuperior = tSuperior;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettMeta() {
        return tMeta;
    }

    public void settMeta(String tMeta) {
        this.tMeta = tMeta;
    }

    public String gettComponent() {
        return tComponent;
    }

    public void settComponent(String tComponent) {
        this.tComponent = tComponent;
    }

    public String gettUrl() {
        return tUrl;
    }

    public void settUrl(String tUrl) {
        this.tUrl = tUrl;
    }

    public String gettEname() {
        return tEname;
    }

    public void settEname(String tEname) {
        this.tEname = tEname;
    }

    public String gettIdentification() {
        return tIdentification;
    }

    public void settIdentification(String tIdentification) {
        this.tIdentification = tIdentification;
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
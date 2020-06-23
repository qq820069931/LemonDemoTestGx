/*
 * @ClassName UserDO
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
public class UserDO extends BaseDO implements DOBasicOperation {
    /**
     * @Fields tId 
     */
    private Long tId;
    /**
     * @Fields tUsername 
     */
    private String tUsername;
    /**
     * @Fields tName 
     */
    private String tName;
    /**
     * @Fields tPassword 
     */
    private String tPassword;
    /**
     * @Fields tEmail 
     */
    private String tEmail;
    /**
     * @Fields tPhone 
     */
    private String tPhone;
    /**
     * @Fields tDepartment 
     */
    private String tDepartment;
    /**
     * @Fields tPost 
     */
    private String tPost;
    /**
     * @Fields tNormal 
     */
    private Byte tNormal;
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

    public String gettUsername() {
        return tUsername;
    }

    public void settUsername(String tUsername) {
        this.tUsername = tUsername;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public String gettEmail() {
        return tEmail;
    }

    public void settEmail(String tEmail) {
        this.tEmail = tEmail;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    public String gettDepartment() {
        return tDepartment;
    }

    public void settDepartment(String tDepartment) {
        this.tDepartment = tDepartment;
    }

    public String gettPost() {
        return tPost;
    }

    public void settPost(String tPost) {
        this.tPost = tPost;
    }

    public Byte gettNormal() {
        return tNormal;
    }

    public void settNormal(Byte tNormal) {
        this.tNormal = tNormal;
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
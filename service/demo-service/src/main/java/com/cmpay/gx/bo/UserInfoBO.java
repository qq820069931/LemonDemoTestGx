package com.cmpay.gx.bo;

import com.cmpay.lemon.framework.annotation.DataObject;
import lombok.Data;

import java.time.LocalDate;
/**
 * @author GX
 */
@Data
@DataObject
public class UserInfoBO {

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

    @Override
    public String toString() {
        return "UserInfoBO{" +
                "tId=" + tId +
                ", tUsername='" + tUsername + '\'' +
                ", tName='" + tName + '\'' +
                ", tPassword='" + tPassword + '\'' +
                ", tEmail='" + tEmail + '\'' +
                ", tPhone='" + tPhone + '\'' +
                ", tDepartment='" + tDepartment + '\'' +
                ", tPost='" + tPost + '\'' +
                ", tNormal=" + tNormal +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", isUse=" + isUse +
                '}';
    }

    public Long gettId() {
        return tId;
    }

    public String gettUsername() {
        return tUsername;
    }

    public String gettName() {
        return tName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public String gettEmail() {
        return tEmail;
    }

    public String gettPhone() {
        return tPhone;
    }

    public String gettDepartment() {
        return tDepartment;
    }

    public String gettPost() {
        return tPost;
    }

    public Byte gettNormal() {
        return tNormal;
    }

    public String getCreateBy() {
        return createBy;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public Byte getIsUse() {
        return isUse;
    }
}

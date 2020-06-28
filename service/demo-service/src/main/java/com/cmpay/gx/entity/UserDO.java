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
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;


@Data
@DataObject
public class UserDO extends BaseDO implements DOBasicOperation {

    /**
     * @Fields Id
     */
    private Long id;
    /**
     * @Fields Username
     */
    private String username;
    /**
     * @Fields tName
     */
    private String name;
    /**
     * @Fields tPassword
     */
    private String password;
    /**
     * @Fields tEmail
     */
    private String email;
    /**
     * @Fields tPhone
     */
    private String phone;
    /**
     * @Fields tDepartment
     */
    private String department;
    /**
     * @Fields tPost
     */
    private String post;
    /**
     * @Fields tNormal
     */
    private Byte normal;
    /**
     * @Fields List<UserDO></>
     */
    private List<UserDO> users;
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
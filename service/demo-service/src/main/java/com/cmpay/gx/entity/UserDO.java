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
import lombok.Data;
import java.time.LocalDate;


@Data
@DataObject
public class UserDO extends BaseDO implements DOBasicOperation {

    /**
     * @Fields id
     */
    private Long id;
    /**
     * @Fields username
     */
    private String username;
    /**
     * @Fields name
     */
    private String name;
    /**
     * @Fields password
     */
    private String password;
    /**
     * @Fields email
     */
    private String email;
    /**
     * @Fields phone
     */
    private String phone;
    /**
     * @Fields department
     */
    private String department;
    /**
     * @Fields post
     */
    private String post;
    /**
     * @Fields normal
     */
    private Byte normal;

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
package com.cmpay.gx.dto;

import com.cmpay.gx.entity.UserDO;
import com.cmpay.lemon.framework.annotation.DataObject;
import lombok.Data;

import java.util.List;

/**
 * @author GX
 */
@Data
public class UserRspDTO {

    /**
     * @Fields tId
     */
    private Long id;
    /**
     * @Fields tUsername
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

}

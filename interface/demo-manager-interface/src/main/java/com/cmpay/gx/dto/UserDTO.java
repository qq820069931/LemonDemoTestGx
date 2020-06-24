package com.cmpay.gx.dto;

import com.cmpay.gx.entity.UserDO;
import lombok.Data;

import java.util.List;


@Data
public class UserDTO {

    /**
     * @Fields id
     */
    private Long id;
    /**
     * @Fields username
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

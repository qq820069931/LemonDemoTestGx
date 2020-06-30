package com.cmpay.gx.bo;

import com.cmpay.framework.data.response.GenericRspDTO;
import com.cmpay.gx.entity.UserDO;
import lombok.Data;

import java.util.List;

/**
 * @author GX
 */
@Data
public class UserInfoBO  {

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
    /**
     *
     */
    private int[] roles;

}

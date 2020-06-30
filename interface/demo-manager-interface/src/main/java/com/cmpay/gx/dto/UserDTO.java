package com.cmpay.gx.dto;

import com.cmpay.framework.data.response.GenericRspDTO;
import com.cmpay.framework.data.response.PageableRspDTO;
import com.cmpay.gx.entity.UserDO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Data
public class UserDTO extends PageableRspDTO {

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
     * @Fields hone
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
     * @Fields createDate
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate createDate;
    /**
     * @Fields tNormal
     */
    private Byte normal;
    /**
     * @Fields List<UserDO></>
     */
    private List<UserDO> users;
}

package com.cmpay.gx.bo;

import com.cmpay.gx.entity.User_Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class User_RoleBO {

    /**
     * @Fields id
     */
    private Long id;
    /**
     * @Fields uId
     */
    private Long userId;
    /**
     * @Fields rId
     */
    private Long roleId;
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

    List<User_Role> listRole;

}

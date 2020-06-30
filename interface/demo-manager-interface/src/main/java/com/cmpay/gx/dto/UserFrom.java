package com.cmpay.gx.dto;

import com.cmpay.framework.data.response.GenericRspDTO;
import lombok.Data;

@Data
public class UserFrom extends GenericRspDTO {
    private String username;
    private String password;
    private String email;
    private String phone;

}

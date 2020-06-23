package com.cmpay.gx.controller;


import com.cmpay.framework.data.response.GenericRspDTO;
import com.cmpay.gx.dto.UserRspDTO;
import com.cmpay.gx.msgEnum.MsgEnum;
import com.cmpay.gx.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author GX
 */
@RestController
public class UserController  {
    @Resource
    private UserService userService;


    @GetMapping("/user/info")
    public GenericRspDTO<UserRspDTO> getAuditDepartmentInfo()  {
         UserRspDTO userRspDTO=new UserRspDTO();
        // BeanUtils.copyProperties(userRspDTO, userService.getUserInfo(1L));
       //  System.out.println(userService.getUserInfo(1L).toString());
      // new   LoginAuthenticationProcessor("/user/info");

        return GenericRspDTO.newInstance(MsgEnum.SUCCESS, userRspDTO);
    }

}

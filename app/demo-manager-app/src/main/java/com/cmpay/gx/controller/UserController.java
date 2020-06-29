package com.cmpay.gx.controller;


import com.cmpay.framework.data.response.GenericRspDTO;
import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.dto.UserDTO;
import com.cmpay.gx.dto.UserRspDTO;
import com.cmpay.gx.entity.UserDO;
import com.cmpay.gx.msgEnum.MsgEnum;
import com.cmpay.gx.service.UserService;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.security.SecurityUtils;
import com.cmpay.lemon.framework.security.UserInfoBase;
import com.cmpay.lemon.framework.utils.PageUtils;
import com.mysql.cj.protocol.Security;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.actuate.autoconfigure.ManagementServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author GX
 */
@RestController
public class UserController  {
    @Resource
    private UserService userService;



    @PostMapping("/user/insert")
    public void InsertUser( @QueryBody UserDTO UserDTO)  {
        UserInfoBO userInfoBO =new UserInfoBO();
        BeanUtils.copyProperties(userInfoBO, UserDTO);
        userService.insert(userInfoBO);

    }

    @GetMapping("/v1/ui-template/user/info")
    public GenericRspDTO<UserRspDTO> UserLogin(@QueryBody UserDTO UserDTO)  {
        UserRspDTO userRspDTO=new UserRspDTO();
        UserInfoBO userInfoBO =new UserInfoBO();
        UserInfoBase login= SecurityUtils.getLoginUser();
        userInfoBO.setUsername(login.getLoginName());
        userInfoBO.setPassword(login.getMblNo());
        BeanUtils.copyProperties(userInfoBO, UserDTO);
        UserDO userdo= userService.FindUser(userInfoBO);
        BeanUtils.copyProperties(userRspDTO, userdo);
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS,userRspDTO);
    }



    @PostMapping("/user/Find")
    public List<UserDO> UserFind(int pageNum,int pagesize, UserDTO UserDTO)  {
        List<UserDO> list=new ArrayList<>();
        UserDO UserDO=new UserDO();
        BeanUtils.copyProperties(UserDO, UserDTO);
        if(pageNum==0||pagesize==0){
        list=  userService.Find(UserDO);
            BeanUtils.copyProperties(UserDTO, UserDO);
        }
        else {
            list=  PageUtils.pageQuery(pageNum,pagesize,() -> { return this.userService.Find(UserDO); });

        }

        return list;
    }

    @PostMapping("/v1/ui-template/user/list")
    public List<UserDO>  FindAll(){
        UserDO UserDO=new UserDO();
        List<UserDO> list=new ArrayList<>();
        list= userService.Find(UserDO);

        return list;

    }


}

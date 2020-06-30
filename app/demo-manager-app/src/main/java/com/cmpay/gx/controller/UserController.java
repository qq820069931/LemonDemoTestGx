package com.cmpay.gx.controller;


import com.cmpay.framework.data.response.GenericRspDTO;
import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.dto.UserDTO;
import com.cmpay.gx.dto.UserRspDTO;
import com.cmpay.gx.entity.UserDO;
import com.cmpay.gx.msgEnum.MsgEnum;
import com.cmpay.gx.service.UserService;
import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.security.SecurityUtils;
import com.cmpay.lemon.framework.security.UserInfoBase;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author GX
 */
@RestController
public class UserController  {
    @Resource
    private UserService userService;



    @PostMapping("/v1/ui-template/user/save")
    public GenericRspDTO<UserRspDTO> InsertUser( @RequestBody UserInfoBO userInfoBO)  {
        long unboundedLong = new Random().nextLong();
        userInfoBO.setId(unboundedLong);
        System.out.println(userInfoBO);
        userService.insert(userInfoBO);
        UserRspDTO userRspDTO=new UserRspDTO();
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS,userRspDTO);
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
    public PageInfo<UserDO> UserFind(int pageNum, int pagesize, UserDTO UserDTO)  {
        List<UserDO> list=new ArrayList<>();
        PageInfo<UserDO> pageInfo=null;
        UserDO UserDO=new UserDO();
        BeanUtils.copyProperties(UserDO, UserDTO);
        if(pageNum==0||pagesize==0){
        list=  userService.Find(UserDO);
            BeanUtils.copyProperties(UserDTO, UserDO);
        }
        else {
            //pageInfo=  PageUtils.pageQuery(pageNum,pagesize,() -> { return this.userService.Find(UserDO); });
          //  PageUtils.pageQueryWithCount(pageNum,pagesize,()->BeanC)
        }
        return pageInfo;
    }

    @PostMapping("/v1/ui-template/user/list")
    public GenericRspDTO<List<UserDO>>  FindAll(){
        UserDO UserDO=new UserDO();
        List<UserDO> list=null;
        list= userService.Find(UserDO);
        System.out.println(list.toString());
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS,list);
    }




    @GetMapping("/v1/ui-template/user/info/{id}")
    public GenericRspDTO<UserDO> UserLogin(@PathVariable Long id)  {
        UserDO UserDO=new UserDO();
        UserDO.setId(id);
        List<UserDO> list= new ArrayList<>();

        list=userService.Find(UserDO);
        UserDO=list.get(0);
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS,UserDO);
    }

    @PostMapping("/v1/ui-template/user/update")
    public GenericRspDTO<UserDO> UpdataUser(@RequestBody UserInfoBO userInfoBO)
    {

        UserDO UserDO=new UserDO();
        BeanUtils.copyProperties(UserDO, userInfoBO);
        System.out.println(userInfoBO);
        userService.UpdateUser(UserDO);
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS,UserDO);
    }

}

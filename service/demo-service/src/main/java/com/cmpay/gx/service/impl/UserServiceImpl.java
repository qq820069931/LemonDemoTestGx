package com.cmpay.gx.service.impl;


import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.dao.IUserDao;
import com.cmpay.gx.entity.UserDO;
import com.cmpay.gx.service.UserService;
import com.cmpay.lemon.common.utils.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

/**
 * @author gx
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private IUserDao iUserDao;




    @Override
    public UserDO FindUser(UserInfoBO userbo) {
        UserDO userDO =new UserDO();
        userDO.setPassword(userbo.getPassword());
        userDO.setUsername(userbo.getUsername());

      return iUserDao.FindUser(userDO);
    }

    @Override
    public int insert(UserInfoBO user)  {
        UserDO userDO =new UserDO();
        BeanUtils.copyProperties(userDO, user);

        userDO.setName("我");
        userDO.setNormal((byte) 1);
        userDO.setCreateDate(LocalDate.now());
        userDO.setCreateBy("gx");
        userDO.setDepartment("s");
        userDO.setPost("ss");
        userDO.setUpdateBy("gx");
        userDO.setIsUse((byte) 1);
        userDO.setUpdateDate(LocalDate.now());
        System.out.println(userDO);

        return iUserDao.insert(userDO);
    }

    @Override
    public  List<UserDO> Find(UserDO user)  {
        return iUserDao.find(user);
    }

    @Override
    public int UpdateUser(UserDO user) {
        return iUserDao.UpdateUser(user);
    }


}

package com.cmpay.gx.service.impl;


import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.dao.IUserDao;
import com.cmpay.gx.entity.UserDO;
import com.cmpay.gx.service.UserService;
import org.springframework.beans.BeanUtils;
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
        userDO.setNormal((byte) 1);
        userDO.setCreateDate(LocalDate.now());
        userDO.setCreateBy("gx");
        userDO.setUpdateBy("gx");
        userDO.setIsUse((byte) 1);
        userDO.setUpdateDate(LocalDate.now());


        return iUserDao.insert(userDO);
    }

    @Override
    public  List<UserDO> Find(UserDO user)  {
        UserDO userDO =new UserDO();


        return iUserDao.find(userDO);
    }

    @Override
    public int UpdateUser(UserDO user) {
        return iUserDao.update(user);
    }


}

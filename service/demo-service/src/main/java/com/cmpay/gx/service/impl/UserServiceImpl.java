package com.cmpay.gx.service.impl;


import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.dao.IUserDao;
import com.cmpay.gx.entity.UserDO;
import com.cmpay.gx.service.UserService;
import com.cmpay.lemon.common.utils.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author gx
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private IUserDao iUserDao;


    @Override
    public UserInfoBO FindInfoByid(Long id) {
        return null;
    }

    @Override
    public UserDO FideUser(UserDO userDO) {
 //      UserDO userDO =new UserDO();
 //       BeanUtils.copyProperties(userDO, userInfoBO);
//        BeanUtils.copyProperties (userInfoBO,iUserDao.FideUser(userDO));
        return iUserDao.FideUser(userDO);
    }
}

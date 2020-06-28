package com.cmpay.gx.service.impl;

import com.cmpay.gx.dao.IUser_RoDao;
import com.cmpay.gx.service.User_RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GX
 */
@Service
public class User_RoleServiceImpl implements User_RoleService {
    @Resource
    private IUser_RoDao user_RoDao;

    @Override
    public int deleRole(int Uid, int Rid) {
        return user_RoDao.deleRole(Uid,Rid);
    }
}

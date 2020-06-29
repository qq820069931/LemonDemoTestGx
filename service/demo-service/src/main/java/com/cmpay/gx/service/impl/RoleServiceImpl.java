package com.cmpay.gx.service.impl;

import com.cmpay.gx.dao.IRoleDao;
import com.cmpay.gx.entity.RoleDO;
import com.cmpay.gx.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GX
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private IRoleDao roleDao;

    @Override
    public int UpdateRole(RoleDO RoleDO) {
        return roleDao.UpdateRole(RoleDO);
    }

    @Override
    public int deleRole(int Rid) {
        return roleDao.deleRole(Rid);
    }
}

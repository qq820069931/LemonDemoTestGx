package com.cmpay.gx.service;

import com.cmpay.gx.entity.RoleDO;

/**
 * @author GX
 */
public interface RoleService {
    /**
     *
     * @param RoleDO
     * @return
     */
    int  UpdateRole(RoleDO RoleDO);

    /**
     *
     * @param Rid
     * @return
     */
    int deleRole(int Rid);

}

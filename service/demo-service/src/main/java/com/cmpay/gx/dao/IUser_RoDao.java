/*
 * @ClassName IUser_RoDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 14:23:33
 */
package com.cmpay.gx.dao;

import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.entity.User_Role;
import com.cmpay.gx.entity.User_RoleKey;
import com.cmpay.lemon.framework.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUser_RoDao extends BaseDao<User_Role, User_RoleKey> {
    /**
     *
     * @param Uid 用户ID
     * @param Rid 角色id
     * @return
     */
    int deleRole(int Uid,int Rid);


}
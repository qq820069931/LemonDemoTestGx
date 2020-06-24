/*
 * @ClassName IUserDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-22 08:49:32
 */
package com.cmpay.gx.dao;

import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.entity.UserDO;
import com.cmpay.gx.entity.UserDOKey;
import com.cmpay.lemon.framework.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
/**
 * @author GX
 */
@Mapper
public interface IUserDao extends BaseDao<UserDO, Long> {
    /**
     *
     * @param user
     * @return   UserDO
     */
    UserDO FindUser(UserDO user);

    /**
     *
     * @param user
     * @return
     */
    int UpdateUser(UserDO user);
}
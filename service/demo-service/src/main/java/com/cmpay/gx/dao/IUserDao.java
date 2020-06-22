/*
 * @ClassName IUserDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-22 08:49:32
 */
package com.cmpay.gx.dao;

import com.cmpay.gx.entity.UserDO;
import com.cmpay.gx.entity.UserDOKey;
import com.cmpay.lemon.framework.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDao extends BaseDao<UserDO, UserDOKey> {
}
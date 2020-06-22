/*
 * @ClassName IRoleDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-22 08:49:32
 */
package com.cmpay.gx.dao;

import com.cmpay.gx.entity.RoleDO;
import com.cmpay.gx.entity.RoleDOKey;
import com.cmpay.lemon.framework.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRoleDao extends BaseDao<RoleDO, RoleDOKey> {
}
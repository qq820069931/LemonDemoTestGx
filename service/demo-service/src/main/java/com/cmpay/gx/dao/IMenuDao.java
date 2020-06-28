/*
 * @ClassName IMenuDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 14:22:50
 */
package com.cmpay.gx.dao;

import com.cmpay.gx.entity.MenuDO;
import com.cmpay.gx.entity.MenuDOKey;
import com.cmpay.lemon.framework.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMenuDao extends BaseDao<MenuDO, MenuDOKey> {
}
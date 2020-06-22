/*
 * @ClassName IMenuDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-22 09:40:22
 */
package com.cmpay.gx.dao;

import com.cmpay.gx.entity.MenuDO;
import com.cmpay.gx.entity.MenuDOKey;
import com.cmpay.lemon.framework.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author GX
 */
@Mapper
public interface IMenuDao extends BaseDao<MenuDO, MenuDOKey> {
}
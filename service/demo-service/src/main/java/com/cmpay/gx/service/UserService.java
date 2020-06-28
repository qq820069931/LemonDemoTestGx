package com.cmpay.gx.service;

import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.entity.UserDO;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
/**
 * @author GX
 */
public interface UserService {
    /**
     *
     * @param user
     * @return   UserInfoBO
     */
    UserDO FindUser(UserInfoBO user);

    /**
     *
     * @param user
     * @return int
     */
     int   insert(UserInfoBO user) ;

    /**
     *
     * @param user
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */

    List<UserDO> Find(UserDO user) ;

    /**
     *
     * @param user
     * @return
     */

    int UpdateUser(UserDO user);

}

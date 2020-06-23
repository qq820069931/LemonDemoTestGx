package com.cmpay.gx.service;

import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.entity.UserDO;

import java.util.List;
/**
 * @author GX
 */
public interface UserService {
    /**
     * 根据ID查找
     * @param id
     * @return
     */
    UserInfoBO FindInfoByid(Long id);

    /**
     *
     * @param user
     * @return   UserInfoBO
     */
    UserDO FideUser(UserDO user);


}

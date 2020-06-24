package com.cmpay.gx.Login;

import com.cmpay.gx.bo.UserInfoBO;
import com.cmpay.gx.entity.UserDO;
import com.cmpay.gx.msgEnum.MsgEnum;
import com.cmpay.gx.service.UserService;
import com.cmpay.lemon.common.exception.LemonException;
import com.cmpay.lemon.framework.security.SimpleUserInfo;
import com.cmpay.lemon.framework.security.UserInfoBase;
import com.cmpay.lemon.framework.security.auth.AbstractGenericMatchableAuthenticationProcessor;
import com.cmpay.lemon.framework.security.auth.GenericAuthenticationToken;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author GX
 */

public class LoginAuthenticationProcessor  extends AbstractGenericMatchableAuthenticationProcessor<GenericAuthenticationToken> {

   @Autowired
   private UserService userService;


    /**
     * @param filterProcessesUrl 认证Url, 前缀必须与GenericAuthenticationFilter拦截的Url前缀一致
     * /security/login
     */
    public LoginAuthenticationProcessor(String filterProcessesUrl) {
        super(filterProcessesUrl);
    }

    @Override
    protected UserInfoBase doProcessAuthentication(GenericAuthenticationToken genericAuthenticationToken)  {
        HttpServletRequest request = genericAuthenticationToken.getAuthenticationRequest().getHttpServletRequest();
        UserInfoBO userInfoBO = bindLoginData(request);
        UserDO login = userService.FindUser(userInfoBO);
        return new SimpleUserInfo(login.getId()+"", login.getUsername(),login.getPassword());
    }


    private UserInfoBO bindLoginData(HttpServletRequest request) {
        UserInfoBO userLoginBO = null;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            InputStream is = request.getInputStream();
            userLoginBO = objectMapper.readValue(is, UserInfoBO.class);
        } catch (IOException e) {
            throw LemonException.create(e);
        } catch (Exception e) {
            LemonException.throwLemonException(MsgEnum.FAIL, e.getMessage());
        }
        return userLoginBO;
    }



}

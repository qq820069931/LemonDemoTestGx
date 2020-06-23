//package com.cmpay.gx.Login;
//
//import com.cmpay.gx.bo.UserInfoBO;
//import com.cmpay.gx.entity.UserDO;
//import com.cmpay.gx.msgEnum.MsgEnum;
//import com.cmpay.gx.service.UserService;
//import com.cmpay.lemon.common.exception.LemonException;
//import com.cmpay.lemon.framework.security.SimpleUserInfo;
//import com.cmpay.lemon.framework.security.UserInfoBase;
//import com.cmpay.lemon.framework.security.auth.AbstractGenericMatchableAuthenticationProcessor;
//import com.cmpay.lemon.framework.security.auth.GenericAuthenticationToken;
//
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.AuthenticationException;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.io.InputStream;
//
//
//public class LoginAuthenticationProcessor  extends AbstractGenericMatchableAuthenticationProcessor<GenericAuthenticationToken> {
//
//   @Autowired
//   private UserService userService;
//   @Resource
//   private Object UserDO;
//
//    /**
//     * @param filterProcessesUrl 认证Url, 前缀必须与GenericAuthenticationFilter拦截的Url前缀一致
//     * /security/login
//     */
//    public LoginAuthenticationProcessor(String filterProcessesUrl) {
//        super(filterProcessesUrl);
//    }
//
//    @Override
//    protected UserInfoBase doProcessAuthentication(GenericAuthenticationToken genericAuthenticationToken) throws AuthenticationException {
//        HttpServletRequest request = genericAuthenticationToken.getAuthenticationRequest().getHttpServletRequest();
//        UserDO userDO = bindLoginData(request);
//        UserDO login = userService.FideUser(userDO);
//        System.out.println(login.toString());
//        return new SimpleUserInfo(String.valueOf(login.gettId()),login.gettUsername(),login.gettPasswordrd());
//    }
//
//
//    private UserDO bindLoginData(HttpServletRequest request) {
//        UserDO userDO = null;
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        try {
//            InputStream is = request.getInputStream();
//            UserDO = objectMapper.readValue(is, UserDO.class);
//        } catch (IOException e) {
//            throw LemonException.create(e);
//        } catch (Exception e) {
//            LemonException.throwLemonException(MsgEnum.FAIL, e.getMessage());
//        }
//        return userDO;
//    }
//
//
//
//}

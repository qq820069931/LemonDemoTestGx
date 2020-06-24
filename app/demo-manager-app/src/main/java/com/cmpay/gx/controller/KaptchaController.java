package com.cmpay.gx.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @author GX
 */


@Controller
public class KaptchaController {
    /**
     * 验证码工具
     */
    @Autowired
    DefaultKaptcha defaultKaptcha;

    @RequestMapping("/captcha")
    public String defaultKaptcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        byte[] captcha = null;
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            // 将生成的验证码保存在session中
            String createText = defaultKaptcha.createText();
            request.getSession().setAttribute("rightCode", createText);
            BufferedImage bi = defaultKaptcha.createImage(createText);
            ImageIO.write(bi, "jpg", out);
            return createText;
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
           return null;
        }
    finally {
            captcha = out.toByteArray();
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/jpeg");
            ServletOutputStream sout = response.getOutputStream();
            sout.write(captcha);
            sout.flush();
            sout.close();
        }

    }

    /**
     * 校对验证码
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView imgvrifyControllerDefaultKaptcha(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView();
        String rightCode = (String) request.getSession().getAttribute("rightCode");
        String tryCode = request.getParameter("tryCode");
        System.out.println("rightCode:" + rightCode + " ———— tryCode:" + tryCode);
        if (!rightCode.equals(tryCode)) {
            model.addObject("info", "验证码错误,请再输一次!");
            model.setViewName("login");
        } else {
            model.addObject("info", "登陆成功");
            model.setViewName("index");
        }
        return model;
    }

    /**
     * 返回首页
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("login");
    }
}

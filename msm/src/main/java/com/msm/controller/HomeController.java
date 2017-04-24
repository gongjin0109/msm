package com.msm.controller;


import com.msm.model.SysUser;
import com.msm.service.UserService;
import com.msm.service.impl.UserServiceImpl;
import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request){
        List<SysUser> list = new ArrayList<SysUser>();
        logger.info(JSONArray.fromObject(list).toString());
        return "login";
    }
}

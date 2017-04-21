package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lenovo on 2017/4/15.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    /**
     * 这种请求方式，需要配试图解析器
     * @return
     */
    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /**
     * 这种请求方式，不需要配试图解析器
     * @return
     */
    @RequestMapping(value = "/demo" ,method = RequestMethod.GET)
    public String demo(){
        return "/demo1.jsp";
    }
}

package com.iotek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String str = request.getParameter("str");
        System.out.println("跳转页面："+str);
        if (str.equals("login")){
            return "login";
        }
        if (str.equals("register")){
            return "register";
        }
        if (str.equals("addCv")) {
            return "addCv";
        }
        return "../../index";
    }
}

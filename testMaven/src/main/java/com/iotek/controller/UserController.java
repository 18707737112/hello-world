package com.iotek.controller;

import com.iotek.model.Customer;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("loginC")
    public String login(@ModelAttribute("customer")Customer customer, Model model)throws Exception{
        Customer customer1=userService.loginCustomer(customer);

        if(customer1!=null){
            model.addAttribute("customer",customer1);
            return "main";
        }
        return "login";
    }
}

package com.iotek.controller;

import com.iotek.model.Comment;
import com.iotek.model.User;
import com.iotek.service.CommentService;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private CommentService commentService;

    @RequestMapping("login")
    public String login(@ModelAttribute("user")User user, Model model)throws Exception{
        User user1=userService.getLogin(user);
        List<Comment> commentAllList = commentService.getComment();
        model.addAttribute("commentAllList",commentAllList);
        if(user1!=null){
            model.addAttribute("user",user1);
            return "main";
        }
        return "../../index";
    }
}

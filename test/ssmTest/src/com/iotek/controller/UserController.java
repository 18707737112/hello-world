package com.iotek.controller;

import com.iotek.model.Depart;
import com.iotek.model.Emp;
import com.iotek.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private EmpService empService;


    @RequestMapping("login")
    public String login(@ModelAttribute("emp")Emp emp, Model model, HttpServletRequest request)throws Exception{
        Emp emp1=empService.getLogin(emp);
        List<Emp> empList = empService.getAllEmp();
        List<Depart> departList = empService.getAllDepart();
        request.getSession().setAttribute("dList",departList);
        if(emp1!=null){
            model.addAttribute("emp",emp1);
            model.addAttribute("empList",empList);
            return "main";
        }
        return "../../index";
    }

    @RequestMapping("addEmp")
    public String addEmp(Emp emp,String number,Model model, HttpServletRequest request)throws Exception{
        Integer did = Integer.parseInt(number);
        Depart depart = empService.getDepartById(did);
        if(depart!=null){
            return "addEmp";
        }
        emp.setDepart(depart);
        boolean flag = empService.addEmp(emp);
        if (flag){
            return "addEmp";
        }
        return "main";
    }

    @RequestMapping("delDepart")
    public String delDepart(String id,Model model, HttpServletRequest request)throws Exception{
        Integer did = Integer.parseInt(id);
        boolean flag = empService.delDepart(did);
        if (!flag){
            return "delDepart";
        }
        return "main";
    }
}

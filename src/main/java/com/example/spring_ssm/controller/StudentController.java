package com.example.spring_ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping(value = "/test.do")
    public ModelAndView test(){
        System.out.println("hello world");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }
}

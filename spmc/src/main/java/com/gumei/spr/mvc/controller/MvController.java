package com.gumei.spr.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
@RequestMapping("/demo")
public class MvController {
    @RequestMapping("/we")
    public String welcome(){
//        DispatcherServlet
        org.springframework.web.servlet.mvc.Controller
        return  "welcome";
    }
}

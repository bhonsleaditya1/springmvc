package com.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home-controller")
    public String showPage(){
        return "main-menu";
    }
}

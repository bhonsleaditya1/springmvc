package com.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMapping {
    // need controller method to show initial HTML form
    @RequestMapping("/show-form")
    public String showForm(){
        return "show-form";
    }
    // need controller method to process HTML form
    @RequestMapping("/process-form")
    public String processForm(){
        return "process-form";
    }
}

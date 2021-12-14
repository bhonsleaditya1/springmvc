package com.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/form")
public class FormController {
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

    // new controller method to read form data
    // add datato model
    @RequestMapping("/process-form-v2")
    public String modelForm(HttpServletRequest request, Model model){
        // read request parameter form HTML form
        String name = request.getParameter("studentName");
        //convert data to all caps
        name = name.toUpperCase(Locale.ROOT);
        String result = "Form "+name;
        model.addAttribute("message",result);
        return "process-form";
    }
    @RequestMapping("/process-form-v3")
    public String processFormv3(@RequestParam("studentName") String name, Model model){
        //convert data to all caps
        name = name.toUpperCase(Locale.ROOT);
        String result = "Formv3 "+name;
        model.addAttribute("message",result);
        return "process-form";
    }
}

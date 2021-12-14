package com.spring.springmvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentContoller {
    @Value("#{countryOptions}")
    private Map<String,String> countryOptions;

    @RequestMapping("/show-form")
    public String showForm(Model model){
        // create new student object
        Student student = new Student();
        // add student object to model
        model.addAttribute("student",student);
        model.addAttribute("countryOptions",countryOptions);

        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){
        // log input data
        System.out.println("Student: "+student.getFirstName()+" "+student.getLastName());
        return "student-confirmation";
    }
}

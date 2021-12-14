package com.spring.springmvc;

import org.springframework.beans.factory.annotation.Value;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String language;
    private String[] OS;
    private LinkedHashMap<String, String> languageOptions;

    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }

    public Student(){
        // populate country options: used ISO code
        //countryOptions = new LinkedHashMap<>();
//        countryOptions.put("BR","Brazil");
//        countryOptions.put("FR","France");
//        countryOptions.put("DE","Geramny");
//        countryOptions.put("IN","India");
        // populate favorite language options
        languageOptions = new LinkedHashMap<>();
        // parameter order: value, display label
        //
        languageOptions.put("Java", "Java");
        languageOptions.put("C#", "C#");
        languageOptions.put("PHP", "PHP");
        languageOptions.put("Ruby", "Ruby");

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String[] getOS() {
        return OS;
    }

    public void setOS(String[] OS) {
        this.OS = OS;
    }
}

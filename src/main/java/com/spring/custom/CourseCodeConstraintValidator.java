package com.spring.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String[] coursePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext context) {

        boolean result=false;
        if(code!=null){
            for(String temp: coursePrefix) {
                result = code.startsWith(temp);
                if (result)
                    break;
            }
        }

        else
            return true;

        return result;
    }
}

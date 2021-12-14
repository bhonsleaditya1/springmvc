package com.spring.springmvc;


import com.spring.custom.CourseCode;

import javax.validation.constraints.*;


public class Customer {
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1,message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value=0,message = "must be greater then or equal to 0")
    @Max(value=10, message = "must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp ="^[a-zA-Z0-9]{5}",message = "only 5 chars/digits")
    private String postalCode;

    @CourseCode(value = {"TOP"},message = "must start with TOP")
    private String courseCode;

    @NotNull(message = "is required")
    @Min(value=0,message = "must be greater then or equal to 0")
    @Max(value=10, message = "must be less than or equal to 10")
    private int customer;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}

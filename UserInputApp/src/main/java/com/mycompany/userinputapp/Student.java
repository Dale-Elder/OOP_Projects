package com.mycompany.userinputapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Student {
    
    private String id;
    private String name;
    private String course;
    private Double mark;
    private Boolean passed;
    
    public Student (String nameIn, String courseIn)
    {
        this.name = nameIn;
        this.course = courseIn;
        this.mark = 0.0;
    }
    
    public void display()
    {
        System.out.println("Student name: " 
                + this.name 
                + "\nStudent course: " 
                + this.course 
                + "\nStudent mark: " 
                + this.mark);
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getCourse()
    {
        return this.course;
    }
    
    public Double getMark()
    {
        return this.mark;
    }
    
    public void setMark (double newMark)
    {
        if(newMark > 0 == newMark < 100)
        {
            this.mark = newMark;
        }
        else
        {
            System.out.println("Cannot set mark below 0 or above 100");
        }
    }
    
    public void getGrade()
    {
        if(this.mark > 70)
        {
            System.out.println("First");
        }
        else if(this.mark >= 60 == this.mark <= 69)
        {
            System.out.println("2/1");
        }
        else if(this.mark >= 50 == this.mark <= 59)
        {
            System.out.println("2/2");
        }
        else if(this.mark >= 40 == this.mark <= 49)
        {
            System.out.println("Third");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    
    public void didPass()
    {
        if(this.mark < 40)
        {
            passed = false;
            System.out.println("Failed");
        }
        else
        {
            passed = true;
            System.out.println("Passed");
        }
    }
}

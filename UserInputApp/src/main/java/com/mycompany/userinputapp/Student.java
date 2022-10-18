package com.mycompany.userinputapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public abstract class Student {
    
    protected String id, name, course;
    protected Double mark;
    protected Boolean passed;
    
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
    
    abstract public void getGrade();
    
    public Boolean didPass()
    {
        if(this.mark < 40)
        {
            passed = false;
            return false;
        }
        else
        {
            passed = true;
            return true;
        }
    }
}

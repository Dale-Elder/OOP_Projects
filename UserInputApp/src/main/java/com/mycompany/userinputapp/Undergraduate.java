/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.userinputapp;

/**
 *
 * @author User
 */
public class Undergraduate extends Student
{
    
    public Undergraduate(String nameIn, String courseIn)
    {
        super(nameIn, courseIn);
    }
    
    @Override
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
}

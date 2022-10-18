/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.userinputapp;

/**
 *
 * @author User
 */
public class Masters extends Student 
{
    
    public Masters(String nameIn, String courseIn)
    {
        super(nameIn, courseIn);
    }
    
    @Override
    public void getGrade()
    {
        if(this.mark >= 70)
        {
            System.out.println("Distinction");
        }
        else if(this.mark >= 60 == this.mark <= 69)
        {
            System.out.println("Merit");
        }
        else if(this.mark >= 40 == this.mark <= 59)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
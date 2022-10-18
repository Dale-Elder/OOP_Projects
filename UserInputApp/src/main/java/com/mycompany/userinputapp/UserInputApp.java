/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.userinputapp;

import java.util.Scanner;

public class UserInputApp
{
    public static void main(String[] args)
    {
        for( int i=1; i > 0; i--)
        {
            // starting the first scanner to take input
            Scanner scanner1 = new Scanner (System.in);
            //outputting to the user, asking for input
            System.out.println("Please enter student name: ");
            //saving the input line to the studentName string variable
            String studentName = scanner1.nextLine();

            //starting the second scanner to take user input again
            Scanner scanner2 = new Scanner (System.in);
            //outputting message requesting course from user
            System.out.println("Please enter course name: ");
            //saving course name to studentCourse string variable
            String studentCourse = scanner2.nextLine();

            //starting the third scanner to take user input
            Scanner scanner3 = new Scanner (System.in);
            //asking user to input mark details as an integer
            System.out.println("Please enter students mark (0-100): ");
            //saving user input to studentMark string variable
            String studentMark = scanner3.nextLine();
            //converting the string to and integer datatype
            double mark = Double.parseDouble(studentMark);
            
            //creating a new student object with the input data
            Student student = new Student(studentName, studentCourse);
               
            System.out.println ("Name: " + student.getName());
            System.out.println ("Course: " + student.getCourse());
            student.setMark(mark);
            System.out.println ("Mark: " + student.getMark());
            student.getGrade();
            student.didPass();
            
            /*
            if(mark < 0 || mark > 100)
            {
                System.out.println("Error students mark must be between 0 - 100");
            }
            else
            {
                student.display();
            }
            */
            
            /* testing getters
            System.out.println(student.getName());
            System.out.println(student.getCourse());
            System.out.println(student.getMark());
            */
            
            /* testing setter
            student.setMark(99.0);
            System.out.println(student.getMark());
            */
        }
    }
}
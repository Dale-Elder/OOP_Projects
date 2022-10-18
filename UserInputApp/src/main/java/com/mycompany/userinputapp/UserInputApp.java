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
        // testing Undergraduate subclass from abstract student class
        Undergraduate undergrad = new Undergraduate("John", "Software");
        System.out.println("Name: " + undergrad.getName());
        System.out.println("Course: " + undergrad.getCourse());
        undergrad.setMark(89.0);
        System.out.println("Passed: " + undergrad.didPass());
        undergrad.getGrade();
        
        // testing Masters subclass from abstract student class
        Masters master = new Masters("Dave", "Software Engineering");
        System.out.println("Name: " + master.getName());
        System.out.println("Course: " + master.getCourse());
        master.setMark(90.0);
        System.out.println("Passed: " + master.didPass());
        master.getGrade();
        
        /* loop for taking students details in
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
        */    
        
            /*
            // outputting students data
            System.out.println ("Name: " + student.getName());
            System.out.println ("Course: " + student.getCourse());
            student.setMark(mark);
            System.out.println ("Mark: " + student.getMark());
            student.getGrade();
            student.didPass();
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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catapp;

public class Cat
{
    private String name;
    private int age, weight;
    
    public Cat (String nameIn, int ageIn, int weightIn)
    {
        this.name = nameIn;
        this.age = ageIn;
        this.weight = weightIn;
    }
    
    public void walk(int distance)
    {
        // check the weight will be 5 or more after walking that distance.
        if(this.weight - distance < 5)
        {
            System.out.println("The poor cat will be starved if they walk that far!");
        }
        // if it is, reduce the weight by the distance.
        else
        {
            this.weight -= distance;
        }
    }
    
    public void eat(int eat)
    {
        // check the weight won't go above 20 after eating.
        if(this.weight + eat >= 20)
        {
            System.out.println("The cat will explode if it eat's that much food!");
        }
        // if it's not, feed the cat by the eat ammount
        else
        {
        this.weight += eat;
        }
    }

    public void display()
    {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Weight: " + this.weight);
    }
}
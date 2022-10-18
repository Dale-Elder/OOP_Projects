/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.catapp;

public class CatApp
{
    public static void main (String[] args)
    {
        Cat clyde = new Cat ("Clyde", 2, 5);
        Cat binnie = new Cat ("Binnie", 5, 4);
        Cat flathead = new Cat ("Flathead", 7, 10);
        Cat cupra = new Cat ("Cupra", 2, 7);

        
        clyde.display();
        binnie.display();
        
        clyde.walk(1);
        binnie.walk(1);
        
        clyde.display();
        binnie.display();
        
        clyde.walk(1);
        clyde.display();
        
        flathead.eat(2);
        flathead.eat(2);
        flathead.display();
        
        cupra.walk(1);
        cupra.walk(1);
        cupra.walk(1);
        cupra.walk(1);
        cupra.display();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;
import java.util.*;

/**
 *
 * @author fawwa
 */
public class question6 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("ENTER THE RADIUS OF CIRCLE : ");
        double radius = in.nextDouble();
        
        System.out.print("ENTER THE COORDINATE FOR X  : ");
        double x = in.nextDouble();
        
        System.out.print("ENTER THE COORDINATE FOR Y : ");
        double y = in.nextDouble();
        
        
        double dis = Math.sqrt((x*x)-(y*y));
        
        
        if (dis > radius ) {
            System.out.println("THE POINT IS OUTSIDE THE CIRCLE");
            
        } else {
            System.out.println("THE POINT IS INSIDE THE CIRCLE");
        }
        
        
        
        
        
    }
    
}

package com.mycompany.lab3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author fawwa
 */
public class question5 {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("ENTER VALUE OF A");
        int a = in.nextInt();
        System.out.println("ENTER VALUE OF B");
        int b = in.nextInt();
        System.out.println("ENTER VALUE OF C");
        int c = in.nextInt();
        System.out.println("ENTER VALUE OF D");
        int d = in.nextInt();
        System.out.println("ENTER VALUE OF E");
        int e = in.nextInt();
        System.out.println("ENTER VALUE OF F");
        int f = in.nextInt();
        
        double adbc = a*d-b*c ;
        
        if (adbc == 0) { 
            System.out.println("THE SEQUATION IS NO SOLUTION ");
        }else {
        double x = (e*d-b*f)/ adbc;
        double y = (a*f-e*c)/ adbc;
        
            System.out.println("The value of X is : " + x);
            System.out.println("The value of y is : " + y);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }
    


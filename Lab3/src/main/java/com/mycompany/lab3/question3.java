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
public class question3 {
    public static void main(String[] args) {
        
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("ENTER SALE VOLUME :  ");
        double num1 = in.nextDouble();
        double result ;
        
        
        if (num1>1000){
            result = num1*0.125 ;     
        } else if ( num1 > 500 && num1 <= 1000 ) {
            result = num1*0.1;
        }else if ( num1 > 100 && num1 <= 500){
            result = num1*0.075;
        }else {
         result = num1*0.05 ;
    }
        System.out.printf("RM " + "%.2f" , result);
        
        
        
    }
        
    
    
}

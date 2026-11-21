/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;
import java.util.*;

/**
 *
 * @author fawwa
 */
public class question3 {
    
    
    
    public static void reverse(int[] numarray){
        
        
        for(int i = 0 ; i<numarray.length / 2 ; i++){
            int temp = numarray[i]  ;
            numarray[i] = numarray[numarray.length - i  - 1] ;
            numarray[numarray.length - i - 1 ] = temp ; 
                       
        }
        
         for(int i = 0 ; i < numarray.length  ; i++){
        System.out.print(numarray[i] + ",");
    }
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] numarray = new int[10];
        
        for(int i = 0 ; i < 10 ; i++){
        System.out.println("ENTER THE " + (i+1) + " INTEGER : ");
        numarray[i] = in.nextInt();
        }
        
        System.out.println("BEFORE REVERSE");
        
        for(int i = 0 ; i < 10 ; i++){
            System.out.print(numarray[i]+",");
        }
        
        System.out.println("\nAFTER REVERSE");
        reverse(numarray);
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;
import java.util.*;


/**
 *
 * @author fawwa
 */
public class question2 {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("ENTER POSITIVE INTEGER : ");
        int num1 = in.nextInt();
        int sum = 0 ;
        
        for (int i = 1 ; i <= num1 ; i++){
            
            sum = ((i)*(i+1)*(i+2))/6 ; 
            
            System.out.println(sum);
        }
        
    }
    
}

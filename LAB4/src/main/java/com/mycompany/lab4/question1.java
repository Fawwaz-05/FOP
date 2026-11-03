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
public class question1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("ENTER AN INTEGER : ");
        
        int num1 = in.nextInt();
        
          System.out.print("THE FACTOR ARE :  " ) ;
        for ( int i = 1 ; i < num1 ; i++ ){
            if (num1 % i == 0 ) {
                System.out.print(i + " , ");
            }
        }
        System.out.println(num1);
             
    }
    
}

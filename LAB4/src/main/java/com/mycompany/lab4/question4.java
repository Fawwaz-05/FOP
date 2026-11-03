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
public class question4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE YEAR : " );
        int year = in.nextInt();
        System.out.println("ENTER THE FIRST DAY OF THE YEAR (0 FOR MONDAY , 1 FOR TUESDAY , ... , 6 FOR SUNDAY : " );
        int day = in.nextInt();
        
        boolean lead = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ; 
        
        
        int may = 31 + (lead ? 29 : 28) + 31 + 30 ; 
        int maystart = (day+may) % 7 ;
        
        int aug = may + 31 + 30 + 31 ; 
        int augstart = (day + aug) % 7 ;
        
        System.out.println("\n------------------------");
        System.out.println(" May " + year );
        System.out.println("------------------------");
        System.out.println(" SUN MON TUE WED THU FRI SAT");
        
        for ( int i = 0 ; i < maystart ; i++){
            System.out.print("    ");                
        }
        
        for ( int i = 1 ; i <= 31 ; i++){
            System.out.printf("%4d" , i);
            
            if (( i + maystart ) % 7 == 0 ) {
                System.out.println();
            }
        }
        
        
        
        System.out.println("\n------------------------");
        System.out.println(" August " + year );
        System.out.println("------------------------");
        System.out.println(" SUN MON TUE WED THU FRI SAT ");
        
        for ( int i = 0 ; i < augstart ; i++){
            System.out.print("    ");                
        }
        
       for ( int i = 1 ; i <= 31 ; i++){
            System.out.printf("%4d" , i);
            
            if (( i + augstart ) % 7 == 0 ) {
                System.out.println();
            }
        }
        
    }
    
}

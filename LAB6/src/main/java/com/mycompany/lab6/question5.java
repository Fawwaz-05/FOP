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
public class question5 {
    
    public static int checker(int a ,int b , int c ){
        int counter = 0 ;
        
        if((a*b)== c ){
            counter++ ;
        }
        return counter ;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int counter = 0 ;
        
        do{
            System.out.println("ENTER NEGATIVE NUMBER TO QUIT. ");
            int b = rand.nextInt(12) + 1 ;
            int a = rand.nextInt(12) + 1 ;
            System.out.print(b + " x " + a + " = ");
            int c = in.nextInt();
            
            if(c < 0 ){
                break;
            } else {
               counter  += checker(a , b ,c );
            }
            
        }while(true);
        
        System.out.println("YOUR POINT IS " + counter);
    }
    
}

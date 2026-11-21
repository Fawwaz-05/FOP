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
public class question4 {
    
    public static int eucli(int a , int b ){
        int q = 0 ;
        int r = 0 ; 
        
        do{
            q = a/b ;
            r = a%b ;
            
            if(r == 0 ){
                break ;
            } else {
                a = b ;
                b = r ;
            }
            
        }while(true);
        return b;
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println(eucli(24 , 8 ));
        System.out.println(eucli(200 , 625 ));
    }
}

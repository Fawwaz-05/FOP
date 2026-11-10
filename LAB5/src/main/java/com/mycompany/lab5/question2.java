/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;
import java.util.*;
/**
 *
 * @author fawwa
 */
public class question2 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] num = new int[10] ;
        
        for(int i = 0 ; i < num.length ; i++){
            int num1 ;
            boolean dup ;
            
            do {
                dup = false ;
                num1 = rand.nextInt(21);
                
                for(int j = 0 ; j<i ;j++){
                    if(num[j] == num1){
                        dup = true ;
                        break ;
                    }
                }     
            }while(dup);
            num[i] = num1 ;    
        }
        
        for(int x : num){
            System.out.print(x + "\t");
        }
        
            
        
    }
    
}

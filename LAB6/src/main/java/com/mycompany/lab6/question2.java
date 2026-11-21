/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;
import java.lang.classfile.Attributes;
import java.util.*;

/**
 *
 * @author fawwa
 */
public class question2 {
    
    
    public static void multiPrint(int n ,char c ){
        
        for(int i = 0 ; i <= n ; i++){
            System.out.print(c);
            
        }
    }
    
    public static void diamond(int n , char c ){
        
        for(int i = 0 ; i <= n ; i++){
            multiPrint(n-i , ' ');
            multiPrint(2 * i -1 , c);
            System.out.println();
        }
        
        for(int i = n -1 ; i>=1 ; i--){
            multiPrint(n-i, ' ');
            multiPrint(2 * i -1 , c);
            System.out.println();
        }
            
    }
    
    
    public static void triangle(int n , char c ){
        
        for(int i = 1 ; i <= n ; i++){
            multiPrint(n-i, ' ');
            multiPrint(2*i-1, c);
            System.out.println();
        }
        
    }

    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("ENTER CHAR AND THE HOW MANY TIME TO COPY IT");
        char c = in.next().charAt(0);
        int n = in.nextInt();
        
        multiPrint(n,c);
        diamond(n, c);
        triangle(n, c);
        
        
                
    }
    
    
    
}

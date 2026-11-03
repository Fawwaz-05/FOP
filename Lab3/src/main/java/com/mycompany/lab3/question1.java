/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;
import java.util.Scanner;
/**
 *
 * @author fawwa
 */
public class question1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("ENTER FIRST INTEGER : ");
        int num1 = in.nextInt();
        
        System.out.println("ENTER SECOND INTEGER : ");
        int num2 = in.nextInt();
        
        
        System.out.println("ENTER THE OPERATOR ( + , - , * , / , % ) ");
        char ch = in.next().charAt(0);
        
        double result ;
        
        
        
        switch (ch) {
            
            case '+':
                result = num1 + num2 ;
                System.out.println(num1  + " + " + num2 + " = " + result);
                break;
                
            case '-':
                result = num1 - num2 ;
                System.out.println(num1  + " - " + num2 + " = " + result);
                break;
                
            case '*':
                result = num1 * num2 ;
                System.out.println(num1  + " * " + num2 + " = " + result);
                break;
                
                
             case '/':
                result = num1 / num2 ;
                System.out.println(num1  + " / " + num2 + " = " + result);
                break;
                
                
            case '%':
                result = num1 % num2 ;
                System.out.println(num1  + " % " + num2 + " = " + result);
                break;
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

package com.mycompany.lab3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author fawwa
 */
public class task {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
       
        int[][] cor = new int[3][2];
        
        for( int i=0 ; i < 3 ; i++ ){
           
                System.out.print("ENTER COORDINATE FOR X : ");
                cor[i][0] = in.nextInt();
                System.out.print("ENTER COORDINATE FOR Y : ");
                cor[i][1] = in.nextInt();
           
        }
        
        int divide1 ,divide2 ;
       
               divide1 = cor[0][0] - cor[1][0];
               divide2 = cor[0][0] - cor[2][0];
               
               
               if (divide1 == 0 && divide2 == 0){
                   System.out.println("OUTPUT : FALSE ");
               } else {
                   
                   int slope1,slope2;
                   
                   slope1 = (cor[0][1] - cor[1][1]) / divide1;
                   slope2 = (cor[0][1] - cor[2][1]) / divide2;
                   
                   if (slope1 == 1 && slope2 ==1 ) {
                       System.out.println("OUTPUT : FALSE");
                   } else {
                       System.out.println("OUTPUT : TRUE");
                   }
               }
                
                   
                
           
        
        
        
        
        
        
        
        
        
    
        
        
        
        
    }
    
}

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
public class question3 {
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
         
         ArrayList<Integer> num = new ArrayList<>();
         
         do {
            
             System.out.print("ENTER A SCORE [negeative score to quit] : ");
             int score = in.nextInt();
             
             if (score < 0 ){
                 break ;
             }  
             num.add(score);
             
             }while (true);
         
         int max = num.get(0);
         int min = num.get(0);
         double sum,ave ;
         ave = 0 ;
         sum = 0 ;
         
         for( int i = 1 ; i < num.size() ; i++ ){
             
             int curr = num.get(i);
             
             if (curr > max ){
                 max = curr ;
             }
              if (curr < min ){
                  min = curr ;
              }
         }
         for( int i = 0 ; i < num.size() ; i++ ){
              sum += num.get(i);
              ave += Math.pow(num.get(i),2) ;
         }
         
         // extra 
         
         int maxScore = Collections.max(num);
         int minScore = Collections.min(num);
         
         System.out.println("THE MAXIMUM VALUE IS : " + max);
         System.out.println("THE MINIMUM VALUE IS : " + min);
         System.out.println("THE AVERAGE IS : " + (sum/num.size()));
         
         double s ; 
         s = 0 ;
         
         s = Math.sqrt((ave - ( Math.pow(sum,2)/num.size()))/ (num.size()-1) );
         
         System.out.printf("THE STANDARD DEVIATION IS : %.2f " , s );
         
         
         
         
         
         
         
         
         
         
         
         
         
         }
        
    }
    


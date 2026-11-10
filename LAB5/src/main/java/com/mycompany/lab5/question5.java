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
public class question5 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] num = new int[20] ;
        Scanner in = new Scanner(System.in);
        
        for(int i = 0 ; i<num.length ; i++){
            num[i] = rand.nextInt(100) + 1;
            System.out.print(num[i] + " ");
        }
        
        
        System.out.println("\n AFTER SORT");
        for(int j = 0 ; j <num.length ; j++){
        for(int i = 0 ; i<num.length-1-j ; i++){
            if (num[i] < num[i+1]){
            int temp = num[i];
            num[i] = num[i+1];
            num[i+1] = temp ;
            
        }
        }
        }
         for(int x : num){
             System.out.print(x + " ");
         }
         
         System.out.print("\n ENTER THE VALUE THAT YOU WANT TO FIND : ");
         int val = in.nextInt();
          System.out.println("____________________________________________________________________-");
         System.out.println("THIS IS LINEAR SEARCH ");
          System.out.println("____________________________________________________________________-");
         int loop1 = 0; 
         boolean jum1  = false ;
         
         for(int i = 0 ; i < num.length ; i ++){
             loop1++ ;
             if(num[i] == val ){
                 jum1 = true;
                 break;
             }
             
         }
         
         if(jum1 == true){
             System.out.println("THE VALUE IS FOUND");
         } else {
             System.out.println("THE VALUE IS NOT FOUND");
         }
         
         System.out.println("THE TOTAL LOOP FOR LIBEAR SEACRH IS : " + loop1);
          System.out.println("____________________________________________________________________-");
          System.out.println("THIS IS BINARY SEARCH ");
          System.out.println("____________________________________________________________________-");
          
          int high = num.length-1;
          int low = 0;
          int middle ;
          boolean jum2 = false ;
          int loop2=0;
          
          
          while ( low <= high){
              loop2++;
              middle = (low+high)/2;
              if ( val == num[middle]){
                  jum2 = true;
                  break;
              } else if ( val > num[middle]){
                  high = middle -1 ;  
              } else {
                  low = middle + 1 ; 
              }
              
          }
          
          if(jum2 == true){
             System.out.println("THE VALUE IS FOUND");
         } else {
             System.out.println("THE VALUE IS NOT FOUND");
         }
         
         System.out.println("THE TOTAL LOOP FOR BINARY SEACRH IS : " + loop2);

    }
    
}

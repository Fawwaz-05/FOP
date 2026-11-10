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
public class question1 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.print("ENTER NUMBER OF STUDENT : ");
        int num = in.nextInt();
        
        int[] score = new int[num];
        
        for(int i = 0 ; i < score.length ; i++ ){
            score[i] = rand.nextInt(101);
        }
        
        int max = score[0];
        int min = score[0];
        int sum = 0 ;
        
        for(int i = 0 ; i < score.length ; i++ ){
            System.out.println("THE SCORE FOR STUDENT " + (i+1)+ " IS " + score[i] + "\t");
            if (score[i]>max){
                max = score[i];
            }
             if (score[i]<min){
                min = score[i];
            }
             sum += score[i];
             
        }
        System.out.println("THE HIGHEST VALUE IS : " + max );
        System.out.println("THE LOWEST VALUE IS : " + min );
        System.out.println("THE AVERAGE SCORE IS : " + (sum / score.length));
        
        
    }
    
}

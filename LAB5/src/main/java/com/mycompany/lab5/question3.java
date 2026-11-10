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
public class question3 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.print("ENTER THE TOTAL NUMBER OF EMPLOYE : ");
        int total = in.nextInt();
        
        int[][] tol = new int[total][7];
        
        
        for(int i = 0 ; i < tol.length ; i++){
            for(int j= 0 ; j<7 ; j++){
            tol[i][j] = rand.nextInt(8)+1;
        }}
        
        System.out.print("ENTER THE NUMBER OF EMPLOYEE : ");
        int em = in.nextInt();
        int sum = 0 ;
        
        for( int i = 0 ; i<7 ; i++){
            System.out.println("THE WORK HOUR FOR DAY : " + (i+1) + " IS " + tol[em-1][i] );
            sum += tol[em-1][i];
        }
        System.out.println("THE TOTAL HOUR FOR THIS WEEK IS : " + sum );
    }
    
}

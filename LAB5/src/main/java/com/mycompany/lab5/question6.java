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
public class question6 {
    public static void main(String[] args) {
         
        
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROW OF PASCAL TRIANGLE TO GENERATE : ");
        int row = in.nextInt();
        
        int[][] mat = new int[row][row];
        
        for(int i= 0 ; i < mat.length ; i++){
            
            mat[i][0]=1;
            
            for(int j= 1 ; j<= i ; j++){
                mat[i][j]= mat[i-1][j-1] + mat[i-1][j];
            } 
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%-5d", mat[i][j]);
            }
            System.out.println();
        }
        
        
        
    }
    
    
    
    
    
}

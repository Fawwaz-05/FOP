/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author fawwa
 */
public class question4 {
    public static void main(String[] args) {
        
        int[][] mat = {{1,5,7} , {3,6,9} , {5,3,8}};
        int[][] rotate = new int[mat.length][mat.length];
        
        for(int  i = 0 ; i< mat.length ; i++){
            for(int j= 0; j<mat[i].length ; j++){
                System.out.printf("%5d" , mat[i][j]);
            }
            System.out.println();
        }
        
        
        
    for(int  i = 0 ; i< mat.length ; i++){
            for(int j= 0; j<mat.length ; j++){
                rotate[j][mat.length - 1 - i] = mat[i][j];
            }
        }
    
    
    System.out.println("AFTER 90 DEGREE");
    for(int  i = 0 ; i< mat.length ; i++){
            for(int j= 0; j<mat[i].length ; j++){
                System.out.printf("%5d" , rotate[i][j]);
            }
            System.out.println();
        }
    
    
    
    
    }    
}

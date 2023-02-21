/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_assignment04;

/**
 *
 * @author user
 */

// 2.Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
public class Question2 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 5;
        int sum = 0 ;
        System.out.println(sum(n1,n2,sum));
        
    }
    static int sum(int n1, int n2 , int sum){
        if(n1==n2){
            return sum;
        }else{
            sum += n1*7;
            return sum(n1+1,n2, sum);
        }
        
        
    }
}

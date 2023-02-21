/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229_assignment04;

/**
 *
 * @author user
 */ 
//1. Write a function that prints "Hello World" n times recursively.

public class Question1 {

    public static void main(String[] args) {
        int n = 2;
        print(n);
    }
    static void print(int n){
        
        if(n==0){
            System.out.println(".....");
        }else{
            System.out.println("Hello World");
            print(n-1);
        }
    }
}

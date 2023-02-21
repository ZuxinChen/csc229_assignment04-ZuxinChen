/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_assignment04;

/**
 *
 * @author user
 */
//3. Write a function that implements the binary search algorithm recursively.
public class Question3 {
    public static void main(String[] args) {
          int size = 10;
          int[] arry ={0, 13, 24, 35, 46, 54, 66, 71,89, 99};
          int key = 35;
          
          System.out.println(key + " is found in " + 
                             BinarySearch(arry,0,size-1,key));
        
    }
    static int BinarySearch(int[] arry, int low, int high, int key){
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;
        
        if(arry[mid] < key){
            return  BinarySearch(arry,mid+1,high,key);
        }else if(arry[mid]> key){
            return  BinarySearch(arry,low,mid-1,key);
        }else{
              return mid;  
        }
        
    }
}

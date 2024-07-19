/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ass_3;

import java.util.Scanner;

/**
 *
 * @author 6student107
 */
public class Q_5 {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int a = 0;
        for(int i = 0 ; i < s1.length() ; i++){
            for(int j = i+1 ; j<s1.length();j++){
                   if(s1.charAt(i)==s1.charAt(j)){
                       a = 1;
                       break;
                   }      
                   else{
                       a = 0;
                   }
            }   
        }
        if(a==1){
                System.out.println("here is duplicate");
            }
        else{
            System.out.println("here is no duplicate");
        }
    }
}
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
public class Q_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number how many name you want to insert : ");
        
        byte n = s.nextByte();
        
        String[] names = new String[n+1];
        for(int i = 0;i<n+1;i++){
            names[i] = s.nextLine();
        }
        String temp;
        for(int i = 0 ; i < n+1 ; i++){
            for(int j = i+1 ; j<n+1;j++){
                if (names[i].compareTo(names[j])>0){
                    temp=names[j];
                    names[j]=names[i];
                    names[i]=temp;
                }      
            }
        }
        
        for(int i = 0;i<n+1;i++){
            System.out.println(names[i]);
        }
    }
}

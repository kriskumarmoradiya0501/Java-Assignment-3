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
public class Q_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String s1 = s.nextLine();
        
        System.out.println("Enter String which you want to find occurance from s1 : ");
        String s2 = s.nextLine();
        
        System.out.println("Occurence index is : "+s1.indexOf(s2));
        
    }
}

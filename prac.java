/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ass_3;

/**
 *
 * @author 6student107
 */
public class prac {
    public static void main(String[] args) {
        String s = "Krish";
        String s1 = "Moradiya";
        
        System.out.println("for not compaiiring "+s1.equalsIgnoreCase(s));
        System.out.println("for compaire"+s1.equals(s));
        System.out.println("for replace"+s1.replace("moradiya", "MOradiya"));
        System.out.println("for sub string"+s1.substring(1,4));
        System.out.println("");
        
        char[] c = s1.toCharArray();
        
        System.out.println("size of char arry"+c.length);
        System.out.println("");
        
 
    }
}

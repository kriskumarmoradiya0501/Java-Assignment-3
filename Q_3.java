//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Locale;

public class Q_3 {

    public static void main(String[] args) {
        String name = "Krish";
        System.out.println(name);
        int value = name.length();
        String lowstr = name.toLowerCase();
        System.out.println(lowstr);
        String uperstr = name.toUpperCase(Locale.ROOT);
        System.out.println(uperstr);
        String nontrim = "     Moradiya Krishkumar Hiteshbhai";
        System.out.println(nontrim);
        System.out.println(nontrim.trim());
        System.out.println(name.substring(4));
        System.out.println(name.substring(1, 5));
        System.out.println(name.replace('r', 'k'));
        System.out.println(name.startsWith("K"));
        System.out.println(name.endsWith("K"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("K"));
        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.equals("Krish"));
        System.out.println(name.equalsIgnoreCase("krish"));
    }
}

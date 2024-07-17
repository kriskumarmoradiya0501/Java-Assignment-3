import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = s.nextLine();
        System.out.println("String 1 : "+s1);

        System.out.println("Length of String 1 "+s1.length());

        System.out.print("Enter String 2 which you want to concat : ");
        String s2 = s.nextLine();
        String s3 = s1+" "+s2;
        System.out.println("String 1 and String 2 Concated String : "+s3);

        char[] b = s2.toCharArray();
        String s4 = "";
        for (int i = s2.length();i>0;i--){
            s4=s4+b[i-1];
        }
        System.out.println("Reverse of String 2 "+s4);

        System.out.println("SubString of Concated String "+s3.substring(1,5));

        System.out.print("Enter String 5 to check the string is palindrome or not : ");
        String s5 = s.nextLine();
        String s6 = "";
        for (int i = s5.length()-1;i>=0;i--){
            s6=s6+s5.charAt(i);
       }
        if(s5.equals(s6)){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not Palindrome String");
        }

        System.out.println("Enter String to count string Words : ");
        String s7 = s.nextLine();
        s7 = s7.trim();
        String[] tem = s7.split("\\s+");
        int count= tem.length;
        System.out.println(count);

    }
}

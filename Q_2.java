import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();

        byte a = 0;
        for(char c : s1.toCharArray()){
            if(Character.isDigit(c)){
                a = 1;
                break;
            }
        }
        if(a==1){
            System.out.println("It hase digit.");
        }
        else {
            System.out.println("It hase not digit.");
        }
    }
}

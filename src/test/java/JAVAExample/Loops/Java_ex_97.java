package JAVAExample.Loops;

import java.util.Scanner;

public class Java_ex_97 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout Character ");
        String input =sc.next();
        char ch = input.charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Not an alphabet");
        }




    }
}

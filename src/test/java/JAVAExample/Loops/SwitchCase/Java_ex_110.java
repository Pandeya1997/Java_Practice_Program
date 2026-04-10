package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_110 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charter , I will tell you if is a vowel or Not Vowel");
        String input = sc.next().toLowerCase();
        char ch = input.charAt(0);
        switch (ch){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not Vowel");
                break;

        }
         sc.close();


        }
}

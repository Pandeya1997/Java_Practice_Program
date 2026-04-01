package JAVAExample.Loops;

import java.util.Scanner;

public class Java_ex_103 {
    public static void main(String[] args) {
 // check  the alphabet has 5 vowels  or Consonant
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet Later");
        String later = sc.next();
        char ch = later.charAt(0);

        if((ch == 'a' || ch=='A' )|| (ch =='e' || ch=='E')|| (ch== 'i' || ch=='I' )|| (ch == 'o'|| ch=='O' )|| (ch=='u' || ch =='U') ){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }

  sc.close();
    }
}

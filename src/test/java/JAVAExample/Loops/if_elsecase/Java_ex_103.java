package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_103 {
    public static void main(String[] args) {
 // check  the alphabet has 5 vowels  or Consonant
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet Later");
        String input = sc.next().trim();
        char ch = Character.toLowerCase(input.charAt(0));
//        char ch = later.charAt(0);

//        if((ch == 'a'  )|| (ch =='e')|| (ch== 'i' )|| (ch == 'o' )|| (ch=='u' ) ){
//            System.out.println("Vowel");
//        }else {
//            System.out.println("Consonant");
//        }

        if ("aeiou".indexOf(ch) != -1) {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }


  sc.close();
    }
}

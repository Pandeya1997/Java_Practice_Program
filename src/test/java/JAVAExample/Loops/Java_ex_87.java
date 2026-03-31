package JAVAExample.Loops;

import java.util.Scanner;

public class Java_ex_87 {
    public static void main(String[] args) {

        // Max number in two

     Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        int max = Math.max(num1,num2);
        System.out.println("Max by Math.max function "+ max);
//        if(num1 > num2){
//            System.out.println("Max is -->" +num1);
//        }
//        else {
//            System.out.println("MAx number 2--> "+num2);
//        }
        sc.close();

    }
}

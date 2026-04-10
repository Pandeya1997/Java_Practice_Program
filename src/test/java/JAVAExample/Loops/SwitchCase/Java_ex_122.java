package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_122 {
    public static void main(String[] args) {
/*
Program to Perfrom Arithmetic Operations
take a input from user input1 , input2, as int and ask the user what want to do enterv
 char +,+,/,5,-, YOU WILL SHARE THE RESULT BY USING THE SWITCH

 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Input 1 ");
        int input1 = sc.nextInt();
        System.out.println("Enter Your Input 2");
        int input2 = sc.nextInt();
        int result;
        System.out.println("Enter operation (+, -, *, /):");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result:" + (input1 + input2));
                break;
            case '-':
                System.out.println("Result:" + (input1 - input2));
                break;
            case '/':
                System.out.println("Result:" + (input1 / input2));
                break;
            case '*':
                System.out.println("Result:" + (input1 * input2));
                break;
            default:
                System.out.println("Invalid Opreation ");
                break;

        }

    }
}
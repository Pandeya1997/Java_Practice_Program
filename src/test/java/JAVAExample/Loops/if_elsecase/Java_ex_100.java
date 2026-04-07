package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_100 {
    public static void main(String[] args) {

// Java Program with if loop
        // FizzBUZZ Test

//        What is FizzBuzz?
//
//👉 For numbers from 1 to N:
//
//        If number divisible by 3 → print "Fizz"
//        If divisible by 5 → print "Buzz"
//        If divisible by both 3 & 5 → print "FizzBuzz"
//        Else → print the number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num =sc.nextInt();

        if(num%3 == 0 && num%5 ==0){
            System.out.println("FizzBuzz");
        } else if (num %3 == 0) {
            System.out.println("Buzz");

        } else if (num%5 == 0) {
            System.out.println("Fizz");
        }else {
            System.out.println(num);
        }
    }
}

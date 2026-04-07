package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_104 {
    public static void main(String[] args) {
 // Largest Number of three number
 Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the Number 1st");
        int input1 = sc.nextInt();
        System.out.println( "Enter the Number 2nd ");
        int input2 = sc.nextInt();
        System.out.println( "Enter the Number 3rd");
        int input3 = sc.nextInt();

        int max= input1;
        if(input2>max)
            max = input2;
        if(input3>max)
            max = input3;

        System.out.println("Maximum number- " +max);

  sc.close();
    }
}

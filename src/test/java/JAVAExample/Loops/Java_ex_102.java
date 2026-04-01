package JAVAExample.Loops;

import java.util.Scanner;

public class Java_ex_102 {
    public static void main(String[] args) {
 // Print Numbers Divisible by 3 & 5 (1–100)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        for (int i = 0; i<=100 ; i++){
            if(num%3==0 && num%5==0 ){
                System.out.println("Number is Divisible by 3&5 ==> "+i);
            }

        }

  sc.close();
    }
}

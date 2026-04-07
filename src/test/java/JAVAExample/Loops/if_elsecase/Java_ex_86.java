package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_86 {
    public static void main(String[] args) {
// Taking an input for the user
// scanner class

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        if(num %2 ==0){
            System.out.println("Number is Even "+num );
        }else {
            System.out.println("Number is odd "+ num);
        }
        sc.close();

    }
}

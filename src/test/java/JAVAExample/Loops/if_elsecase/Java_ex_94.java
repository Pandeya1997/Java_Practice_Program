package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_94 {
    public static void main(String[] args) {

//        Voting Eligibility
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your Age");
         int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are Eligble for vating ");
        }else {
            System.out.println("you are not eligble");
        }


        sc.close();

    }
}

package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_90 {
    public static void main(String[] args) {

        //Check Leap Year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
       if((year%4 ==0 && year %100 != 0) || year %400 == 0){
           System.out.println("leap year");
       }else {
           System.out.println("is not leep year");
       }




    }
}

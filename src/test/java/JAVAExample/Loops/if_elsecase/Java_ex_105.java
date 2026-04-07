package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_105 {
    public static void main(String[] args) {
 // check Leap Year Program
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Year");
        int input = sc.nextInt();
        if (input%4 == 0 || input %100 !=0 ||input %400 ==0 ){
            System.out.println("this year is leap year");
        }else {
            System.out.println("Normal Year");
        }
  sc.close();
    }
}

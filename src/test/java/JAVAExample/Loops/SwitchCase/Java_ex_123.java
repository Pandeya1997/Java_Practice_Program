package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_123 {
    public static void main(String[] args) {
/*
Largest three Number
 */
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number");
        int num3 = sc.nextInt();
         int Max_num = 0;

        if (num1>num2 && num1 > num3){
            Max_num = num1;
            System.out.println("Largest of three Number" + Max_num);
        } else if (num2 > num1 && num2 > num3) {
            Max_num = num2;
            System.out.println("Largest of three Number" +Max_num);
        }else if(num3>num1 && num3 >num2){
            Max_num = num3;
            System.out.println("Largest of three Number" +Max_num);

    }
sc.close();
    }
}
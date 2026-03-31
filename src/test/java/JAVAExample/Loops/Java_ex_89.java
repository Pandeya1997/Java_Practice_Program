package JAVAExample.Loops;

import java.util.Scanner;

public class Java_ex_89 {
    public static void main(String[] args) {

        //Largest of 3 Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number num1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number num2");
        int num2 = sc.nextInt();
        System.out.println("Enter Number num3");
        int num3 = sc.nextInt();
//
//        int Larg_Num = Math.max(num1,Math.max(num2,num3));
//        System.out.println("Largest of 3 Numbers-->"+ Larg_Num);

        if (num1 > num2 & num1 > num3){
            System.out.println("Largest  Numbers of "+ num1);
        } else if (num2 > num1 & num2 > num3) {
            System.out.println("Largest Number of+ "+num2);
        }else{
            System.out.println("Larges Number of -->"+ num3);
        }


        sc.close();

    }
}

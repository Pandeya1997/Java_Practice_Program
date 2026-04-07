package JAVAExample.Loops.SwitchCase;


import java.util.Scanner;

public class Java_ex_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber 1-7 , i will tell you day it is ");
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Mon!");
                break;
            case 2:
                System.out.println("Thu!");
                break;
            case 3:
                System.out.println("Web!");
                break;
            case 4:
                System.out.println("thur!");
                break;
            case 5:
                System.out.println("Fri!");
                break;
            case 6:
                System.out.println("Sat!");
                break;
            case 7:
                System.out.println("sun!");
                break;
            default:
                System.out.println("1-7 are number allowed");
                break;

        }
        sc.close();

    }
    

}

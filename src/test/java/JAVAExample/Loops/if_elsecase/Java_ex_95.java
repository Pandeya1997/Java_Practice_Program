package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_95 {
    public static void main(String[] args) {

//     Find Greatest Among 4 Numbers
        // num1 = 12, numb2= 23 , num3 = 27, num4 = 54;
        Scanner sc = new Scanner(System.in);
System.out.println("Enter your Number1");
int num1 = sc.nextInt();
System.out.println("Enter your Number2");
int num2 = sc.nextInt();
System.out.println("Enter Your Number3");
int num3 = sc.nextInt();
System.out.println("Enter your Number4");
int num4 = sc.nextInt();

int GreatestNumber = Math.max(num1,Math.max(num2,Math.max(num3,num4)));
System.out.println("Find Greatest Among 4 Numbers-->"+ GreatestNumber);

// without predefine function
        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println("Find Greatest Among 4 Numbers-->"+num1);
        } else if (num2>num1 && num2 >num3 && num2 > num4) {
            System.out.println("Find Greatest Among 4 Numbers-->"+num2);
        }else if (num3>num1 && num3 >num2 && num3 > num4) {
            System.out.println("Find Greatest Among 4 Numbers-->"+num3);
        }else   {
            System.out.println("Find Greatest Among 4 Numbers-->"+num4);
        }

        int max ;

        if (num2> num1) num1 = num2;
        if (num3 > num1) num1 = num3;
        if (num4 > num1) num1 = num4;
         max=num1;
        System.out.println("Max is: " + max);


        sc.close();

    }
}

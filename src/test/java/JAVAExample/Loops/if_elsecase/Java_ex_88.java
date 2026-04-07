package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_88 {
    public static void main(String[] args) {

        //  Positive, Negative, or Zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
       int num =  sc.nextInt();

       if(num>0){
           System.out.println("number is postive -->"+num);
       } else if (num<0){
           System.out.println("Number is Negative-->"+num);
       }else  {
           System.out.println("Number is zero");
       }
       sc.close();

    }
}

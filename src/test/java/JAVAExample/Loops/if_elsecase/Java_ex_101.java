package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_101 {
    public static void main(String[] args) {
 // check the Number Postive / Negative number  / Zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
       int num =  sc.nextInt();
  if(num>0 && num !=0){
      System.out.println("Number is Postive -->" + num);
  } else if (num == 0) {
      System.out.println("Number is Zero" + num);
  }else {
      System.out.println("Number is Negative" + num);
  }
  sc.close();
    }
}

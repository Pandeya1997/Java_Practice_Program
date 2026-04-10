package JAVAExample.Loops.SwitchCase;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Java_ex_116 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Day ");
        int Day = sc.nextInt();
//     int Day = 2;
      switch (Day){
          case 1:
              System.out.println("Monday");
              break;
          case 2:
              System.out.println("TusDay");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case  4:
              System.out.println("Tharsday");
              break;
          default:
              System.out.println("invliad day ");
      }

    }
}


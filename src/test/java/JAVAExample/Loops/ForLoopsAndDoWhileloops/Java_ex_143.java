package JAVAExample.Loops.ForLoopsAndDoWhileloops;

import java.util.Scanner;

public class Java_ex_143 {
    public static void main(String[] args) {

  // Factorial Program
        // 1! -->1
        // 2! -->2*1 = 2
        // 3! --> 3*2*1 = 6
        // 4! --> 4*3*2*1 = 24
        Scanner sc = new Scanner(System.in);
        System.out.println("PLZ Enter Your Factorial Numner ");
        int num = sc.nextInt();
//        int num = 5;
    long     fact = 1 ;
        for(int i = num ; i>=1; i--){
           fact = fact *i;
           // System.out.println(fact);
        }
        System.out.println("Factorial of"+ num +" --> "+fact);
        }

    }



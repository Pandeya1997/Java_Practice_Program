package JAVAExample.Loops;

import java.util.Scanner;

public class Java_ex_99 {
    public static void main(String[] args) {

// Triangle classifier
        // write a Program that classifies a triangle based on its side lenghth
        // given three input values rrspersting the lengths of the sides determine
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1 , side2, side3,side4, I will tell about the triangle ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if ((side1 == side2) && (side1 == side3) && (side2 == side3)){
            System.out.println("EQ");
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            System.out.println("ISO");
        }else {
            System.out.println("Scalene!");
        }
    }
}

package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_91 {
    public static void main(String[] args) {

        //Grade System

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  obtainedMarks ");
        int obtainedMarks  = sc.nextInt();

        System.out.println("Total Marks");
        int Total_marks = sc.nextInt();

        double  Persentage = ((double) obtainedMarks/Total_marks)*100;


        if(Persentage>=60){
            System.out.println("First Grade");
        } else if (Persentage>=59 ) {
            System.out.println("2nd grade");
        } else if (Persentage>=33) {
            System.out.println("3rd Grad");
        } else if (Persentage >0 ) {
            System.out.println("4th grad");

        }else {
            System.out.println("Something went wrong! Marks cannot be negative.");
        }
 sc.close();

    }
}

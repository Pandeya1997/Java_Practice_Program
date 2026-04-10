package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_118_Switch_with_String {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = sc.next().toLowerCase();

       // String name = "Abhishek";
        switch (name){

            case "abhishek":
                System.out.println("Abhishek Pandey");
                break;
            case "rahul":
                System.out.println("Rahul Sharma");
            default:
                System.out.println("Unknown");


        }

    }
}


package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_119_Modern_Switch {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        int day = sc.nextInt();

        String Result = switch (day){
            case 1 -> "Monday";
            case 2 -> "TusDay";
            case 3 -> "WedDay";
            default -> "Invalid Day";
        };

        System.out.println(Result);


    }
}


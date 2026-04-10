package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_120_Modern_Switch {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = sc.next().toLowerCase();
        String Result =  switch (name){
            case "abhishek" -> "abhishek pandey";
            case "rahul" -> "Rahul Kumar";
            case "amit" -> "amit kumae";
            default -> "Unknown";
        };
        System.out.println(Result);
sc.close();
    }
}


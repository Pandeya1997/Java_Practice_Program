package JAVAExample.Loops.SwitchCase;

public class Java_ex_115 {
    public static void main(String[] args) throws IllegalAccessException {

        char code = 'B';

        int val = switch (code) {
            case 'A' -> 65;
            case 'B' -> 66;
            default -> throw new IllegalAccessException("Error");
        };

        System.out.println(val);



    }
}


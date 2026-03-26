package JAVAExample.StringClass;

public class Java_ex_66 {
    public static void main(String[] args) {

        String Password = "Pandey12345";
        String pass_u = Password.toLowerCase();
        System.out.println(Password == pass_u); // false
        System.out.println(Password.equals(pass_u)); // false
        System.out.println(Password.equalsIgnoreCase(pass_u)); // true

    }
}

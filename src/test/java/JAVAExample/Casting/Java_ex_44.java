package JAVAExample.Casting;

public class Java_ex_44 {
    public static void main(String[] args) {
       // char widening
        char ch = 'k';
        int num = ch;

        System.out.println(num);  // 65
    }
}
// 👉 Widening casting is the automatic conversion of a smaller data type into a larger data type in Java. It is safe and does not cause data loss
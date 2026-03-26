package JAVAExample.StringClass;

public class Java_ex_57 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

//| Operator / Method | Meaning                               |
//| ----------------- | ------------------------------------- |
//| `==`              | Checks **reference (memory address)** |
//| `.equals()`       | Checks **content (value)**            |
//

//        Both are stored in String Pool
//        Same reference → == is true
//        Same content → .equals() is true
    }
}

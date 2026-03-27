package JAVAExample.Opretor;

public class Java_ex_70_Ternaryopretor {
    public static void main(String[] args) {
//        condition ? true_value : false_value;
   boolean result = 100>40 ? 10<40 :40>10;
        System.out.println(result);

        boolean result1 = 100<40 ? 10<40 :40>10;
        System.out.println(result1);
        boolean result2 = 100<40 ? 10<40 :40<10;
        System.out.println(result2);

        boolean result3 = 100>40 ? 10>40 :40>10;
        System.out.println(result3);

    }


}

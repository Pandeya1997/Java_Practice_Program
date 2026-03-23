package JAVAExample.Casting;

public class Java_ex_46 {
    public static void main(String[] args) {

     int a = 10 ;
        System.out.println(a++ + ++a); // a = 10,10++ = 11,++a = 12,  10+ 12 , a = 12 total = 22
        System.out.println(++a + ++a); //  a = 13 , ++a = 14 , total a = 27
        System.out.println(++a + a++ + a++); // a= ++14 = 15 , a= 15 , E1 = 15, a= 15++ = 16  E2 = 15 , a= 16++ = 17 , E3 = 16
        // E = E1+E2 +E3 = 15+15+16 = 46
        System.out.println(a);
    }
}


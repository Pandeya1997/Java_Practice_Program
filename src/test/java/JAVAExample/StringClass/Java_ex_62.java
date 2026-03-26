package JAVAExample.StringClass;

public class Java_ex_62 {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = s1.intern();
        String s3 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);

//        Memory Alocation
//        String Pool:
//        "Hello"  ← s2, s3
//        Heap:
//        s1 → "Hello"
//        String s1 = new String("Hello");
//  "Hello" → String Pool me
//new String() → Heap me new object
//        String s2 = s1.intern();
//👉 intern() kya karta hai?
//                Pool me same string dhundta hai
//        Mil gaya → uska reference return karta hai
//        s2 → String Pool wala "Hello"
//        s3 → same pool object
//      S1 == s2  --> Heap vs pool -->Heap vs Pool → different reference --> false
//      s2 == s3 --> Both pointing to same pool object --> true
//     s3 == s1 --> pool vs heap --> Diffrent refrences -- > false
//        false == Heap vs pool
//        True  == pool vs pool
//        False   == pool vs heap

//        intern() String Pool ka reference return karta hai.
//        Agar string pool me exist karti hai to wahi object reuse hota hai.
//⚡ Super Trick (Yaad rakhna)
// intern() = pool me le jao
// Pool = same reference reuse

    }
}

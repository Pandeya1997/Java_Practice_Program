package JAVAExample.Array;

public class Java_ex_149 {

    public static void main(String[] args) {
// fixed element
        int[] ages = {12,32,43,23,45};
        // FIxed element

        int[] ages2 = new int[5];
        // case2 - here by default value of all the element will be?
        System.out.println(ages2[0]);
        System.out.println(ages2[4]);

        ages[0] = 11;
        System.out.println(ages2[0]);

        String[] breakfast_items = {"Milk","idli", "frute", "coffee", "tea", "poha"};
        System.out.println(breakfast_items.length);

    }
}

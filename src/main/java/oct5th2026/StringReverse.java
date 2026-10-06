package oct5th2026;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        String reverse = "";
        System.out.println(original.length());

        for (int i = original.length()-1; i>-1; i--){
            reverse = reverse + original.charAt(i);
        }

//        for (int i = 0; i < original.length(); i++){
//            reverse = reverse + original.charAt(i);
//        }
        System.out.println("Revered: " + reverse);

        sc.close();
    }
}

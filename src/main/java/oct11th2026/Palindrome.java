package oct11th2026;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next().toLowerCase();
        String rev = "";

        for (int i = str.length()-1; i > -1; i--){
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)){
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is a not palindrome");

        }

    }
}

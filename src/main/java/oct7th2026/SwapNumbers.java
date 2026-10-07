package oct7th2026;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        b = b + a;
        a = b - a;
        b = b - a;

        System.out.println("1st: " + a + " 2nd: " + b );
    }
}

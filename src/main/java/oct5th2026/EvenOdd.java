package oct5th2026;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is a even number ");
        } else if (num == 0) {
            System.out.println(num + " is neither even nor odd");
        } else {
            System.out.println(num + " is a odd number");
        }
    }
}

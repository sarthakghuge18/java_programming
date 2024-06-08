package operator;

import java.util.Scanner;

// arithmetic operator (+ , - , * , / , % )

public class arithmetic {
    public static void main(String args[]){

        int a , b;

        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("addition : " + (a+b));
        System.out.println("substraction : " + (a-b));
        System.out.println("multiplication : " + a*b);
        System.out.println("division : " + a/b);
        System.out.println("remainder : " + a%b);
        sc.close();

    }
}

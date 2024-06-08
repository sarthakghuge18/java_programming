package operator;

import java.util.Scanner;

public class relational {

    public static void main(String args[]){

        int a,b;
        System.out.println("enter the two number ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("(a < b) " + (a < b));
        System.out.println("(a > b) " + (a > b));
        System.out.println("(a <= b) " + (a <= b));
        System.out.println("(a >= b) " + (a >= b));
        System.out.println("(a == b) " + (a == b));
        System.out.println("(a != b) " + (a != b));

        sc.close();

    }
    
}

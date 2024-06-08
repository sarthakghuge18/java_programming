package input;
import java.util.Scanner;

// we take the input from the user with help of scanner class
/* 
nextInt()
nextDouble()
nextFloat()
nextLong()
nextLine()
next()
*/ 


public class InputOutput {
   
    public static void main(String args[]) {
        System.out.println("taking the input : ");
       
        Scanner sc = new Scanner(System.in);  //creating scanner class object sc
        System.out.print("enter number 1: ");
        int a = sc.nextInt();
        System.out.print("enter number 2 : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum is : " + sum);

        String str1 = sc.nextLine();
        System.out.println(str1);

        sc.close();
    }
}

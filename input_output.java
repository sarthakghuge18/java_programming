import java.util.Scanner;

public class input_output {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value a : ");
        int a=sc.nextInt();
        System.out.print("enter the value b : ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum is : ");
        System.out.print(sum);
    
    }
}

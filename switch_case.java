import java.util.Scanner;

public class switch_case {
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number : ");
        int a=sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("it is one");
                    break;

                case 2:
                    System.out.println("it is two");
                    break;
            
                default:
                    System.out.println("it is invalid number");
                    break;
            }
    }
}

import java.util.Scanner;

public class if_else {
    public static void main(String args []){
            Scanner sc =new Scanner(System.in);
            System.out.print("enter value a : ");
            int a=sc.nextInt();
            System.out.print("enter value b : ");
            int b=sc.nextInt();
            if(a==b){
                System.out.println("a and b are equal");
            }else if (a>b) {
                System.out.println("a is greater");                
            }else{
                System.out.println("b is greater ");
            }
    }
}

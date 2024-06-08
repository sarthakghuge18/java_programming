package decision_statment;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        //it is used execute two statement either if statement or else  statement for single condition

        int a ;
        System.out.println("enter your age : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a > 18){
            System.out.println("you are eligible for voting ");
        }else{
            System.out.println("you are not eligible for voting ");
        }

        System.out.println("thank you .....");
        sc.close();
    }
}

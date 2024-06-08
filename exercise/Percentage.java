package exercise;
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.print("enter the number of subject : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.println("marks "+i);
            sum += sc.nextInt();
        }
        double percent = sum/n;
        System.out.println("percentage is : "+ percent);
        
    }
}

package operator;

public class logical {
    public static void main(String args[]){

        System.out.println("logical AND");
        System.out.println((3 > 2) && (3 > 1));
        System.out.println((3 > 2) && (3 < 1));

        System.out.println("logical OR");
        System.out.println((3 < 2) || (3 > 1));
        System.out.println((3 == 2) || (3 < 1));

        System.out.println("logical NOT");
        System.out.println( !(3 > 2));

    }
}

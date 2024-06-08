package operator;

public class inc_dec {
    public static void main(String[] args) {
        int a = 10 ; 
        System.out.println("a : " + a);

        //preincrement -->
        System.out.println("preincrement : ");
        System.out.println(++a);
        System.out.println(a);


        //postincrement-->
        System.out.println("postincrement : ");
        System.out.println(a++);
        System.out.println(a);





        //predecrement -->
        System.out.println("predecrement : ");
        System.out.println(--a);
        System.out.println(a);


        //postdecrement-->
        System.out.println("postdecrement : ");
        System.out.println(a--);
        System.out.println(a);
    }
}

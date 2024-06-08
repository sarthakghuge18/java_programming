public class type_conversion_casting {

    // implicit or explicit

    public static void main(String args[]) {

        //implicit 

        int a = 10;  //4bytes
        double b = a; //8bytes
        System.out.println(a);
        System.out.println(b);

        //explicit 

        double c = 14.100; //8bytes
        int d = (int)c; //4bytes
        System.out.println(c);
        System.out.println(d);
    }
}

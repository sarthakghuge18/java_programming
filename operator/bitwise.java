package operator;

public class bitwise {
    public static void main(String[] args) {
        //based on binary concept 
        int a = 5 ; // 0101
        int b = 7 ; // 0111

        System.out.println(a & b);  // 0101 & 0111 = 0101 (5)
        System.out.println(a | b);  // 0101 | 0111 = 0111 (7)
        System.out.println(a ^ b);  // 0101 ^ 0111 = 0010 (2)
        System.out.println( ~a);    //  ~0101  = 0101 + 1 = 0110 (6)
    }
}

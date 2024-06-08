//java is statically typed it is neccessary to give the data type to variable

//data types =>
        // 1) primitive
        // 2) non primitive

// 1) primitive data type =>
       // int       -(2^32)/2 to (2^32)/2-1  takes 4 byte
       // byte      (-128 to 127)  take 1 byte
       // float     takes 4 byte
       // char      takes 2 byte
       // bool      size depend on jvm
       // long      takes 8 byte
       // short     -(2^16)/2 to (2^16)/2-1  take 2 byte
       // double    takes 8 byte

// 2) non primitive data type =>
        // String 
        // array
        // class 


public class DataType {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int num3 = 5;
        int sum =num1 + num2 + num3;
        System.out.println(sum);
    }
}

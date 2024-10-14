public class calculator {

    static int addition(int a,int b){
        return a+b; 
    }
    static int subtraction(int a,int b){
        return a-b;
    }
    static int multiplication(int a,int b){
        return a*b;
    }
    static int division(int a,int b){
        return a/b;
    }
    static int remainder(int a,int b){
        return a%b;
    }
    public static void main(String[] args) {

        System.out.println("Addition is: " + addition(11,5));
        System.out.println("Subtraction is: " + subtraction(11, 5));
        System.out.println("Multiplication is: " + multiplication(11, 5));
        System.out.println("Division is: " + division(11, 5));
        System.out.println("Remainder is: " + remainder(11, 5));
        
        
    }
}

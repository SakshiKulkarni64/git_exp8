import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner()
        int a = sc.nextInt();
        int b = sc.nextInt();

        public int add(int a, int b) {
            return a + b;
        }
    
        public int subtract(int a, int b) {
            return a - b;
        }
    
        public int multiply(int a, int b) {
            return a * b;
        }
    
        public int divide(int a, int b) {
            if (b == 0) throw new IllegalArgumentException("Divide by zero");
            return a / b;
        }
    }
}

public class Q7 {
    static int fact = 1;
    static void factorial(int n) {
        
        if (n < 1) {
            System.out.println(fact);
            return; // Base case
        }
        fact *= n; // Calculate factorial
        factorial(n - 1); // Recursive call
        System.out.println(n);
    }
    

    public static void main(String[] args) {
        factorial(3);
    }
}

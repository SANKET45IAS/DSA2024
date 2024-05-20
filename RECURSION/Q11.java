public class Q11 {
    
    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y); // Added return statement here
    }
    
    public static void main(String[] args) {
        int a = 21;
        int b = 5;
        System.out.println(gcd(a, b));
    }
    
}

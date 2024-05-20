public class Q14 {
    static int pro(int m, int n) {
        if (n == 1) {
            return m; 
        }
        return m + pro(m, n - 1); // Recursive call to compute the product
    }

    public static void main(String[] args) {
        System.out.println(pro(1, 6)); // Prints the product of 1 multiplied by itself 6 times
    }
}

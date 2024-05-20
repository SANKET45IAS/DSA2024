public class Q13 {
    public static void Binary(int n) {
        if (n < 1) {
            return;
        }
        Binary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Binary(4
        );
    }
}

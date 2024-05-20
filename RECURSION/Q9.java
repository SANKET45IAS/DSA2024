public class Q9 {
    static int rev=0;
    static void reverse(int n){
        
        if (n==0) {
            System.out.println(rev);
            return;
        }
        rev=rev*10+n%10;
        reverse(n/10);
    }
    public static void main(String[] args) {
        reverse(4735);
    }
    
}

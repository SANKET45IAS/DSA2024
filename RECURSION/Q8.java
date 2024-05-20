public class Q8 {
static int answer=1;
   static  void power(int x,int n){
        if(n==0){
            System.out.println(answer);
            return;

        }
        answer*=x;
        power(x, n-1);
    }
    public static void main(String[] args) {
        power(2,2);
    }
}
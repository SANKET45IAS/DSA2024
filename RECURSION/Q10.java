public class Q10 {
    static int c=0;
    static void nFab(int a,int b,int n){

        if (n==0)
        { 
            System.out.println(c);
            return; 
        }
        c=a+b;
        nFab(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        int n=8;
        nFab(a,b,n-2);
    }
    
}

class R3{
int sum =0;
    void printSum(int i,int n){
        
       if (i==n) {
        sum+=i;
        System.out.println(sum);
        return;//base class
       }
        sum=sum+i;//print
        printSum(i+1,n);//Recursion
        
          
        }
        public static void main (String []args){
           R3 r=new R3();
           int n=1;
           r.printSum(1,10);
            
        }
    
    }
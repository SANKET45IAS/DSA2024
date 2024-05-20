class R4{
    int product =1;
        void printFactorial(int n){
            
           if (n==0) {
            
               System.out.println(product);
               return;//base class
           }
            product*=n;//print
            printFactorial(n-1);//Recursion
            
              
            }
            public static void main (String []args){
               R4 r=new R4();
               int n=5;
               r.printFactorial(n);
                
            }
        
        }
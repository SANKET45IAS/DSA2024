class R5{
    
        void printFib(int a,int b,int Term){
            
           if (Term==0) {
            return;//base class
           }
           int c=a+b;
            System.out.println(c);
            printFib(b,c,Term-1);//Recursion
            System.out.println(c+"------------"+"Value of C");
            System.out.println(Term+"------------"+"Value of Term");
            
              
            }
            public static void main (String []args){
               R5 r=new R5();
               int a=0;
               int b=1;
               int Term=7;
               System.out.println(a);
               System.out.println(b);
               r.printFib(a,b,Term-2);
                
            }
        
        }
class R2{

    static void printNumb(int n){
       if (n>5) { //or n<0
        return;  //terminate the function      /base class
       }
        System.out.println(n);//print
        printNumb(n+1);//Recursion
        System.out.println(n);//do it work and wait for other do there work when other work completely they return back by remove from stackafter the main method was remove fromte stack the program will be exucute 
          
        }
        public static void main (String []args){
           R2 r=new R2();
           int n=1;
           r.printNumb(n);
            
        }
    
    }
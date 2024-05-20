class R1{

void printNumb(int n,String blue,String red ){
   if (n==0) { //or n<0
    return; //terminate the function      /base class
   }
   System.out.println(n+" "+blue+" "+red);
   printNumb(n-1,red,blue);//N=2 RED RA BLUE ACHI MAIN RA AND BLUE RA RED ACHI SO CHANGE HAI JIBA
   System.out.println(n+" "+blue+" "+red);//exception
      
    }
    public static void main (String []args){
       R1 r=new R1();
       int n=4;
       r.printNumb(n,"Blue","Red");
        
    }

}
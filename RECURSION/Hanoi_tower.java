public class Hanoi_tower {
  int step=0;
    public static void towerOfHanoi(int n,String source,String helper,String dest){
      if (n==1) {
        System.out.println("transfer disk "+n+" from "+source +" to "+dest);
        return;
        
      }
      towerOfHanoi(n-1, source, dest, helper);//transfer from source to helper(Destination) with using dest as helper
      System.out.println("transfer disk "+n+" from "+source +" to "+dest);
      towerOfHanoi(n-1,helper, source, dest);//transfer from source to helper(Destination) with using dest as helper
    }
public static void main(String[] args) {
    int n=4;
    towerOfHanoi(n, "Source", "helper ","destination");
}
    
}
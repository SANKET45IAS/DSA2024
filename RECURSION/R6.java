public class R6 {
    int result=1;
    int n;
void calcPower(int base,int power){
    
    if (power==0) {
        System.out.println(base+" to the power "+" is "+result);
        return;
    }
    result*=base;
    calcPower(base, power-1);
    
}
public static void main(String[] args) {
    R6 r = new R6();
    r.calcPower(2, 2);
}
}

public class Q15 {
    static String reverse(String s,int length , String rev){
     if (length<0) {
        return rev;
     }
        rev+=s.charAt(length);
       return  reverse(s, length-1, rev);// jo return karuji saida phuni function ku hnu call karuji
     }
    
    public static void main(String[] args) {
        String s= "pots&pans";
        int length=s.length();
        //System.out.println(length); 
        String rev="";
        String ulta =reverse(s, length-1, rev);
        System.out.println(ulta);
    }
}

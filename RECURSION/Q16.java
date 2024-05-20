public class Q16 {
    static boolean palindrome(String s, int length, String rev) {
        if (length < 0) {
            // If the entire string is checked, compare the original string with its reverse
            return s.equals(rev);
        }
        rev += s.charAt(length);
        return palindrome(s, length - 1, rev); // Recursive call to check the next character
    }
    
    public static void main(String[] args) {
        String s = "racecar";
        int length = s.length() - 1; // Adjusting length to 0-based index
        String rev = "";
        boolean isPalindrome = palindrome(s, length, rev);
        System.out.println("Is palindrome? " + isPalindrome);
    }
}

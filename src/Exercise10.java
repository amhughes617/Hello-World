/**
 * Created by alexanderhughes on 3/10/16.
 */
public class Exercise10 {
    public static void main(String[] args) throws Exception {
        String palindrome = "racecar";
        String nonPalindrome = "hello";
        if (isPalindrome(palindrome) && !isPalindrome(nonPalindrome)) {
            System.out.println("It Works!");
        } else {
            throw new Exception("Fail");
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        while (true) {
            if (i == s.length()/2) {
                return true;
            }
            else if (s.charAt(i) == s.charAt((s.length()-i-1))) {
                i++;
            }
            else {
                return false;
            }
        }
    }
//    public static boolean compare(String s) {
//        for (int i=0; i < s.length()/2; i++) {
//            if (s.charAt(i))
//        }
//    }
}



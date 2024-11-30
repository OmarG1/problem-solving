// 9.- Palindrome Number
/*
 Given an integer x, return true if x is a 
palindrome
, and false otherwise.
*/


public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        for(int i=0; i < num.length();i++){
            if(num.charAt(i) != num.charAt(num.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){ 
        PalindromeNumber solution = new PalindromeNumber();
        int x = 121;
        System.out.println(solution.isPalindrome(x));
    }
}

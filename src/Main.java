import task1.PalindromeChecker;

import static task1.PalindromeChecker.isPalindrome;

public class Main {
    public static void main(String[] args) {
        String inputString = "A man, a plan, a canal: Panama";
        if (isPalindrome(inputString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

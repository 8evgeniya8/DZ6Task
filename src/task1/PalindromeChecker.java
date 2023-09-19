package task1;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int leftIndex = 0, rightIndex = str.length() - 1;
        while (leftIndex < rightIndex) {
            char leftChar = str.charAt(leftIndex);
            char rightChar = str.charAt(rightIndex);

            if (!Character.isLetterOrDigit(leftChar)) {
                leftIndex++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                rightIndex--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                leftIndex++;
                rightIndex--;
            }
        }
        return true;
    }
}


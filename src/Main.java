import task1.PalindromeChecker;
import task2.DuplicateChecker;

import java.util.Arrays;

import static task1.PalindromeChecker.isPalindrome;

public class Main {
    public static void main(String[] args) {
//        task1
        String inputString = "A man, a plan, a canal: Panama";
        if (isPalindrome(inputString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println();

//        task2
        DuplicateChecker duplicateChecker = new DuplicateChecker();
        int[] nums = {1, 2, 6, 4, 3, 4, 8, 5, 1};
        boolean hasDublicate = duplicateChecker.containsDuplicate(nums);
        for (int num : nums) {
            System.out.print(num + " , ");
        }
        System.out.println();
        if (hasDublicate) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

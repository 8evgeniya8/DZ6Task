import task2.DuplicateChecker;
import task3.Solution;

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
//        task3
        Solution solution = new Solution();

        int[] ints = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(ints, target);

        if (result != null) {
            System.out.println("two numbers that sum to the target: " +
                    "[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("no found");
        }
    }
}

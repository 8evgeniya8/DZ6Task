package task3;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndex.containsKey(complement)) {
                return new int[]{numIndex.get(complement), i};
            }
            numIndex.put(nums[i], i);
        }
        try {
            throw new IllegalAccessException("no to sum");
        } catch (IllegalAccessException e) {

            e.printStackTrace();
        }
        return null;
    }
}

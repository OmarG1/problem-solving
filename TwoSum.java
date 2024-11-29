/*
// 1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int k = 1; k < nums.length; k++) {
                int suma = 0;
                if (i != k) {
                    suma = nums[i] + nums[k];
                    if (suma == target) {
                        index[0] = i;
                        index[1] = k;
                        return index;
                    }
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        try {
            int[] result = solution.twoSum(nums, target);
            System.out.println("Found indices: [" + result[0] + ", " + result[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

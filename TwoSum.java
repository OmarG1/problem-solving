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
            System.out.println("Índices encontrados: [" + result[0] + ", " + result[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

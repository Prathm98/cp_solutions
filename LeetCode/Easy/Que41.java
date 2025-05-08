public class Que41 {
    // https://leetcode.com/problems/first-missing-positive/description/
    public int firstMissingPositive(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp > 0 && temp <= nums.length) {
                res[temp - 1] = 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (res[i] == 0)
                return i + 1;
        }
        return nums.length + 1;
    }
}

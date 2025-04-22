public class Que189 {
    // https://leetcode.com/problems/rotate-array/
    public void rotate(int[] nums, int k) {
        int temp[] = nums.clone();
        for(int i=0; i<nums.length; i++){
            nums[(k+i) % nums.length] = temp[i];
        }
    }
}

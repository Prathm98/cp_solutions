public class Que2348 {
    // https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long track = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                track++;
            }else{
                track = 0;
            }
            res += track;

        }
        return res;
    }
}

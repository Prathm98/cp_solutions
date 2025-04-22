// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Que23 {
    public int removeDuplicates(int[] nums) {
        int ele = nums[0], k=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != ele){
                k++;
                nums[k] = nums[i];
                ele = nums[i];
            }
        }
        return k+1;
    }
}

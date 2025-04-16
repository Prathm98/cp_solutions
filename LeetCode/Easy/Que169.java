public class Que169 {
    public int majorityElement(int[] nums) {

        // SOLUTION 1
        // Simple hashmap approach to keep count of each element and return one with
        // maximum

        // HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        // int max = 0, result = 0;
        // for(int r=0; r < nums.length; r++){
        // int updatedCount = 1;
        // if(hm.containsKey(nums[r])) updatedCount += hm.get(nums[r]);
        // hm.put(nums[r], updatedCount);
        // if(updatedCount > max){
        // max = updatedCount;
        // result = nums[r];
        // }
        // }
        // return result;

        // Solution 2
        // Keep track of max occurance element, increase count and result for each
        // occurance
        // decrease the count for each non max element occurance
        // This method works because of majority element condition i.e. it occurs more
        // than n/2 times

        int result = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                result = nums[i];
            if (nums[i] != result) {
                count--;
            } else {
                count++;
            }
        }
        return result;
    }
}

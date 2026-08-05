class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        int count = 1;
        if(nums.length<1){
            return 0;
        }
        while(fast<nums.length){
            if(nums[slow]!=nums[fast]){
                slow++;
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                count++;
            }
            fast++;
        }
        return count;
    }
}
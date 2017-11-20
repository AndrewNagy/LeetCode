# Given an unsorted integer array, find the first missing positive integer.
# 
# For example,
# Given [1,2,0] return 3,
# and [3,4,-1,1] return 2.
# 
# Your algorithm should run in O(n) time and uses constant space.
#

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=0;
        for(int k=0;k<nums.length;k++){
            if(max<nums[k]){
                max=nums[k];
            } 
        }
        Integer[] numbers = new Integer[max+2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            numbers[nums[i]]=Integer.valueOf(nums[i]); 
        }
        int res=1;
        for(int j=1;j<numbers.length;j++){
            if(numbers[j] == null){
                res=j;
                break;
            }

        }
    return res;
        
    }
}

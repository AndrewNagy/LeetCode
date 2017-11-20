#Given an array nums, write a function to move all 0's to the end of it while #maintaining the relative order of the non-zero elements.

#For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums #should be [1, 3, 12, 0, 0].

#Note:
#You must do this in-place without making a copy of the array.
#Minimize the total number of operations.

public class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int i = size-1;
        int temp;
        for(int j = size-2;j>=0;j--){
            if(nums[j] == 0){
               for(int k=j; k!=i;k++){
                temp = nums[k];
                nums[k] = nums[k+1];
                nums[k+1] = temp;
               }
               i--;
            }
        }
    }
}

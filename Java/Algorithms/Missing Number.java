#Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the #one that is missing from the array.

#For example,
#Given nums = [0, 1, 3] return 2.

#Note:
#Your algorithm should run in linear runtime complexity. Could you implement it #using only constant extra space complexity?

public class Solution {
    public int missingNumber(int[] nums) {
        int flag=0;
        for(int x =0;x<nums.length;x++){
            if(nums[x]==0){
                flag=1;
                break;
            }
        }
        int max = 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int[] numbers = new int[max+2];
        for(int j =0;j<nums.length;j++){
            numbers[nums[j]] = nums[j];
        }
        for(int k =flag;k<numbers.length;k++){
            if(numbers[k]==0){
                return k;
            }
        }
        return 0;
    }
}

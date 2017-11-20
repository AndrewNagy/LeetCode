#Given an integer, write a function to determine if it is a power of two.

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<2){
            if(n== 1)return true;
            return false;    
        }
        while (n%2 ==0){
            n=n/2;
        }
        if(n==1)return true;
        return false;
    }
}

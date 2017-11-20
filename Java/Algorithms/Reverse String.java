/*Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

public class Solution {
    public String reverseString(String s) {
        char [] result = s.toCharArray();
        int j  = 0;
        for(int i = result.length-1; i>=0;i--){
            if(j<i){
                char tmp = result[i];
                result[i] =result[j];
                result[j] = tmp;
                j++;
            }
        }
        String res = new String(result);
        return res;
    }
}

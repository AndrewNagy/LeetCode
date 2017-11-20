#Given an integer n, count the total number of digit 1 appearing in all non-#negative integers less than or equal to n.

#For example:
#Given n = 13,
#Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.

public class Solution {
    public int countDigitOne(int n) {
        number = n;
        int sum;
        int res;
        if(n<=0){
            System.out.print(0);
        }
        else{
            int tmp = 0;
            int i=0
            
            while (number>0){
                tmp = number %10;
                if(i==0){
                    if(tmp==0){
                        sum=sum+0;    
                    }
                    else{
                        sum=sum+1;
                    }
                }
                if(tmp == 0){
                    continue;
                }
                else{
                    res=tmp*i*(Java.lang.Math.pow(10,i-1));
                    if(tmp==1){
                        int x = n%(Java.lang.Math.pow(10,i));
                        sum=sum + x + res;
                    }
                    else{
                        sum = sum + Java.lang.Math.pow(10,i) +res;
                    }
                }
                number/=10;
            }
        }
        
    }
}

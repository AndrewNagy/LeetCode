/*Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
*/

import java.util.List;
public class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> a = new ArrayList <String> ();
        for(int i=1;i<=n;i++){
            if(i%3 == 0){
                if(i%5 == 0){
                    a.add("FizzBuzz");
                }
                else a.add("Fizz");
            }
            else if(i%5 == 0){
                a.add("Buzz");
            }
            else a.add(Integer.toString(i));
        }
        return a;
    }
}

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzzSolution sol = new FizzBuzzSolution();
        List <String> ans = sol.fizzBuzz(3);
        System.out.println(ans);
    }
}

class FizzBuzzSolution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for(int i = 1; i<=n; i++){
            if(i%3==0&&i%5==0){
                ans.add("FizzBuzz");
            }
            else if(i%3==0){
                ans.add("Fizz");
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            else{
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}
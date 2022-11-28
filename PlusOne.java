import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static void main(String[] args) {
        PlusOneSolution plusOneSolution = new PlusOneSolution();
        System.out.println(Arrays.toString(plusOneSolution.plusOne(new int[]{9, 9})));
    }
}

class PlusOneSolution {
    private boolean isAllNine(int[] digits){
        for(int i=0;i<digits.length;i++){
            if (digits[i] != 9){
                return false;
            }
        }
        return true;
    }
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] != 9){
            digits[digits.length-1]++;
        }
        else if(isAllNine(digits)){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            for (int i=1;i<newDigits.length;i++){
                newDigits[i] = 0;
            }
            return newDigits;
        }
        else{
            boolean isExceed;
            digits[digits.length-1] = 0;
            isExceed = true;
            for (int i=digits.length-2;i>=0;i--){
                if (isExceed){
                    if (digits[i] == 9){
                        digits[i] = 0;
                        isExceed = true;
                    }
                    else{
                        digits[i]++;
                        break;
                    }
                }
            }
        }
        return digits;
    }
}
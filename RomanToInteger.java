// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public static void main(String[] args) {
        RomanToIntegerSolution romanToIntegerSolution = new RomanToIntegerSolution();
        System.out.println(romanToIntegerSolution.romanToInt("MCMXCIV"));
    }
}

class RomanToIntegerSolution {
    public int romanToInt(String s) {
        int integer = 0;
        for(int i=0; i<s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    integer = integer + 1000;
                    break;
                case 'D':
                    integer = integer + 500;
                    break;
                case 'C':
                    if(i+1<s.length()){
                        if(s.charAt(i+1) == 'D') {
                            i++;
                            integer = integer + 400;
                        }
                        else if(s.charAt(i+1) == 'M') {
                            i++;
                            integer = integer + 900;
                        }
                        else
                            integer = integer + 100;
                    }
                    else {
                        integer = integer + 100;
                    }
                    break;
                case 'L':
                    integer = integer + 50;
                    break;
                case 'X':
                    if(i+1<s.length()){
                        if(s.charAt(i+1) == 'L') {
                            i++;
                            integer = integer + 40;
                        }
                        else if(s.charAt(i+1) == 'C') {
                            i++;
                            integer = integer + 90;
                        }
                        else
                            integer = integer + 10;
                    }
                    else {
                        integer = integer + 10;
                    }
                    break;
                case 'V':
                    integer = integer + 5;
                    break;
                case 'I':
                    if(i+1<s.length()){
                        if(s.charAt(i+1) == 'V') {
                            i++;
                            integer = integer + 4;
                        }
                        else if(s.charAt(i+1) == 'X') {
                            i++;
                            integer = integer + 9;
                        }
                        else
                            integer = integer + 1;
                    }
                    else {
                        integer = integer + 1;
                    }
                    break;
            }
        }
        return integer;
    }
}
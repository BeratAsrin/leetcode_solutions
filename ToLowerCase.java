// https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCaseSolution toLowerCaseSolution = new ToLowerCaseSolution();
        System.out.println(toLowerCaseSolution.toLowerCase("Hello"));
    }
}

class ToLowerCaseSolution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
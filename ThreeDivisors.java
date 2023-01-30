// https://leetcode.com/problems/three-divisors/description/
public class ThreeDivisors {
    public static void main(String[] args) {
        ThreeDivisorsSolution threeDivisorsSolution = new ThreeDivisorsSolution();
        System.out.println(threeDivisorsSolution.isThree(2));
    }
}

class ThreeDivisorsSolution {
    public boolean isThree(int n) {
        int counter = 1;
        for (int i=2; i<=n; i++) {
            if (n%i == 0) {
                counter++;
            }
        }
        if (counter == 3) {
            return true;
        }
        return false;
    }
}
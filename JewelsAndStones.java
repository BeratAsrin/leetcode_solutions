// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStonesSolution jewelsAndStonesSolution = new JewelsAndStonesSolution();
        System.out.println(jewelsAndStonesSolution.numJewelsInStones("aA", "aAAbbbb"));
    }
}

class JewelsAndStonesSolution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsCharArray = jewels.toCharArray();
        char[] stonesCharArray = stones.toCharArray();
        int counter = 0;
        for (char i:jewelsCharArray) {
            for (char j:stonesCharArray) {
                if (i == j) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
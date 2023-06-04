public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();
        String[] words = {"cir","car"};
        System.out.println(solution.longestCommonPrefix(words));
    }
}

class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        String firstWord = strs[0];
        String common = "";
        boolean flag = false;
        for (int i=0;i<firstWord.length();i++) {
            flag = false;
            for(int j=1;j<strs.length;j++) {
                try{
                    if (strs[j].charAt(i) != firstWord.charAt(i)) {
                        flag = true;
                        break;
                    }
                }
                catch (Exception e) {
                    return common;
                }
            }
            if (!flag) {
                common = common + firstWord.substring(i,i+1);
            }
            else {
                break;
            }
        }
        return common;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://leetcode.com/problems/group-anagrams/

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagramsSolution solution = new GroupAnagramsSolution();
        System.out.println(solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}

class GroupAnagramsSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> strsArrayList = new ArrayList<>(Arrays.asList(strs));
        String firstString, secondString, original;
        for (int i=0;i<strsArrayList.size();i++) {
            List<String> innerResult = new ArrayList<>();
            original = strsArrayList.get(i);
            firstString = Stream.of(original.split(""))
                    .sorted()
                    .collect(Collectors.joining());
            innerResult.add(original);
            strsArrayList.remove(i);
            for (int j=i;j<strsArrayList.size();j++) {
                original = strsArrayList.get(j);
                secondString = Stream.of(original.split(""))
                        .sorted()
                        .collect(Collectors.joining());
                if (firstString.equals(secondString)) {
                    strsArrayList.remove(j);
                    innerResult.add(original);
                    j--;
                }
            }
            i--;
            result.add(innerResult);
        }
        return result;
    }
}
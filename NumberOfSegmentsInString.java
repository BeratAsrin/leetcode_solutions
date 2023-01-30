public class NumberOfSegmentsInString {
    public static void main(String[] args) {
        NumberOfSegmentsInStringSolution solution = new NumberOfSegmentsInStringSolution();
        System.out.println(solution.countSegments(", , , ,        a, eaefa"));
    }
}

class NumberOfSegmentsInStringSolution {
    public int countSegments(String s) {
        String[] splitString= s.split(" ");
        int result = splitString.length;
        for (String string:splitString){
            if (string.equals("")){
                result--;
            }
        }
        return result;
    }
}
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://leetcode.com/problems/elimination-game/
// increase the speed
public class EliminationGame {
    public static void main(String[] args) {
        EliminationGameSolution eliminationGameSolution = new EliminationGameSolution();
        System.out.println(eliminationGameSolution.lastRemaining(1000000));
    }
}

class EliminationGameSolution {
    List <Integer> arr;
    int direction = 1; // 1 for from left to right -1 for from right to left
    public int lastRemaining(int n) {
        arr = IntStream.range(1,n+1).boxed().collect(Collectors.toList());
        while (arr.size() > 1){
            arr = removeElements();
            direction = direction * -1;
        }
        return arr.get(0);
    }

    private List <Integer> removeElements(){
        int i = 0;
        if (direction == -1){
            i = arr.size()-1;
            while(i>=0  && arr.size()!=1){
                arr.remove(i);
                i = i - 2;
            }
        }
        else{
            while(i<arr.size() && arr.size()!=1){
                arr.remove(i);
                i++;
            }
        }
        return arr;
    }
}
public class PassPillow {
    public static void main(String[] args) {
        System.out.println(PassPillowSolution.passThePillow(4, 5));
    }
}

class PassPillowSolution {
    public static int passThePillow(int n, int time) {
        int counter = 1;
        boolean direction = false; // true means from left to right
        while (time > 0) {
            if (counter == n) {
                direction = !direction;
            }
            else if (counter == 1) {
                direction = !direction;
            }
            if (direction) {
                counter++;
            }
            else {
                counter--;
            }
            time--;
        }
        return counter;
    }
}
// https://leetcode.com/problems/convert-the-temperature/
public class ConvertTemperature {
    public static void main(String[] args) {
        ConvertTemperatureSolution convertTemperatureSolution = new ConvertTemperatureSolution();
        double[] ans = new double[2];
        ans = convertTemperatureSolution.convertTemperature(36.50);
        System.out.println(ans[0] + " " + ans[1]);
    }
}

class ConvertTemperatureSolution {
    public double[] convertTemperature(double celsius) {
        return new double[] {celsius+273.15, celsius*1.8+32};
    }
}
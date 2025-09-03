public class BmiService {

    public int calculate(double height, int weight) {
        double bmi = (weight / Math.pow(height, 2));
        return (int) bmi;
    }
}

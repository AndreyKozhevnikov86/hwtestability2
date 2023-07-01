public class BmiService {
    public double calculate(double wеight, double height) {
        double result;
        result = wеight / height / height;
        int result1 = (int) result;
        return result1;

    }
}


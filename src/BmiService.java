public class BmiService {
    // weight - вес в килограммах, height - рост в метрах
    public double calculate(double weight, double height) {
        return weight / (height * height);
    }
}

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 56;
        double height = 1.87;
        double bmi = service.calculate(weight, height);
        int bmi1 = (int) bmi;
        System.out.println("Рост - " + height + " м.");
        System.out.println("Масса тела - " + weight + " кг.");
        System.out.println("Индекс массы тела BMI - " + bmi1 + ".");

    }
}
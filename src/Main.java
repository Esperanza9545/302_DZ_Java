public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87; //Рост
        int weight = 98; //Вес

        double index = service.calculate(height, weight);

        System.out.println("Индекс массы тела = " + Math.round(index));
    }
}
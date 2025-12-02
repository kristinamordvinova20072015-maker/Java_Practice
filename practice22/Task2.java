package practice22;


public class Task2 {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        new CalculatorController(view, model);
    }
}

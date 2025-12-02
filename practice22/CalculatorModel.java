package practice22;


public class CalculatorModel {

    private double result;

    public void calculate(double num1, double num2, String op) {
        switch (op) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = (num2 != 0) ? num1 / num2 : Double.NaN;
        }
    }

    public double getResult() {
        return result;
    }
}

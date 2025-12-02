package practice22;


public class CalculatorController {

    private final CalculatorView view;
    private final CalculatorModel model;

    private String firstNumber = "";
    private String operator = "";

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        addDigitListeners();
        addOperationListeners();
    }

    private void addDigitListeners() {
        view.btn0.addActionListener(e -> append("0"));
        view.btn1.addActionListener(e -> append("1"));
        view.btn2.addActionListener(e -> append("2"));
        view.btn3.addActionListener(e -> append("3"));
        view.btn4.addActionListener(e -> append("4"));
        view.btn5.addActionListener(e -> append("5"));
        view.btn6.addActionListener(e -> append("6"));
        view.btn7.addActionListener(e -> append("7"));
        view.btn8.addActionListener(e -> append("8"));
        view.btn9.addActionListener(e -> append("9"));

        view.btnDot.addActionListener(e -> append("."));
    }

    private void append(String s) {
        view.textField.setText(view.textField.getText() + s);
    }

    private void addOperationListeners() {

        view.btnAdd.addActionListener(e -> saveOperator("+"));
        view.btnSub.addActionListener(e -> saveOperator("-"));
        view.btnMul.addActionListener(e -> saveOperator("*"));
        view.btnDiv.addActionListener(e -> saveOperator("/"));

        view.btnEq.addActionListener(e -> {
            String secondNumber = view.textField.getText();

            double num1 = Double.parseDouble(firstNumber);
            double num2 = Double.parseDouble(secondNumber);

            model.calculate(num1, num2, operator);

            view.textField.setText(String.valueOf(model.getResult()));

            firstNumber = "";
            operator = "";
        });
    }

    private void saveOperator(String op) {
        firstNumber = view.textField.getText();
        operator = op;
        view.textField.setText("");
    }
}



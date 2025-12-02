package practice22;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    public JTextField textField = new JTextField(20);

    public JButton btn0 = new JButton("0");
    public JButton btn1 = new JButton("1");
    public JButton btn2 = new JButton("2");
    public JButton btn3 = new JButton("3");
    public JButton btn4 = new JButton("4");
    public JButton btn5 = new JButton("5");
    public JButton btn6 = new JButton("6");
    public JButton btn7 = new JButton("7");
    public JButton btn8 = new JButton("8");
    public JButton btn9 = new JButton("9");

    public JButton btnAdd = new JButton("+");
    public JButton btnSub = new JButton("-");
    public JButton btnMul = new JButton("*");
    public JButton btnDiv = new JButton("/");
    public JButton btnDot = new JButton(".");
    public JButton btnEq = new JButton("=");

    public CalculatorView() {

        setTitle("MyCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));

        addButton(panel, btn7);
        addButton(panel, btn8);
        addButton(panel, btn9);
        addButton(panel, btnDiv);

        addButton(panel, btn4);
        addButton(panel, btn5);
        addButton(panel, btn6);
        addButton(panel, btnMul);

        addButton(panel, btn1);
        addButton(panel, btn2);
        addButton(panel, btn3);
        addButton(panel, btnSub);

        addButton(panel, btn0);
        addButton(panel, btnDot);
        addButton(panel, btnAdd);
        addButton(panel, btnEq);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    /**
     * Метод, который ТЕБЕ НУЖНО БЫЛО оставить
     * (именно его у тебя не хватает)
     */
    private void addButton(JPanel panel, JButton btn) {
        btn.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(btn);
    }
}

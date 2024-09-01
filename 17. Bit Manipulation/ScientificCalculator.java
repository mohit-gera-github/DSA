import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScientificCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private double temp, temp1, result, memory;
    private char operator;
    private boolean isResultDisplayed = false;

    public ScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(400, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(25);
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);

        JPanel textPanel = new JPanel();
        textPanel.add(textField);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 6));

        addButton(buttonPanel, "SIN");
        addButton(buttonPanel, "MR");
        addButton(buttonPanel, "7");
        addButton(buttonPanel, "8");
        addButton(buttonPanel, "9");
        addButton(buttonPanel, "AC");

        addButton(buttonPanel, "COS");
        addButton(buttonPanel, "MC");
        addButton(buttonPanel, "4");
        addButton(buttonPanel, "5");
        addButton(buttonPanel, "6");
        addButton(buttonPanel, "*");

        addButton(buttonPanel, "TAN");
        addButton(buttonPanel, "M+");
        addButton(buttonPanel, "1");
        addButton(buttonPanel, "2");
        addButton(buttonPanel, "3");
        addButton(buttonPanel, "-");

        addButton(buttonPanel, "x^2");
        addButton(buttonPanel, "M-");
        addButton(buttonPanel, "0");
        addButton(buttonPanel, "+/-");
        addButton(buttonPanel, ".");
        addButton(buttonPanel, "+");

        addButton(buttonPanel, "x^3");
        addButton(buttonPanel, "1/x");
        addButton(buttonPanel, "Sqrt");
        addButton(buttonPanel, "log");
        addButton(buttonPanel, "/");
        addButton(buttonPanel, "=");

        addComponent(textPanel, BorderLayout.NORTH);
        addComponent(buttonPanel, BorderLayout.CENTER);
    }

    private void addButton(JPanel panel, String label) {
        JButton button = new JButton(label);
        button.addActionListener(this);
        panel.add(button);
    }

    private void addComponent(Component component, String position) {
        getContentPane().add(position, component);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        switch (s) {
            // Handle other button actions similarly
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                handleNumberButton(s);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                handleOperatorButton(s.charAt(0));
                break;
            case "=":
                handleEqualsButton();
                break;
            // Handle other special buttons (SIN, COS, TAN, etc.) similarly
        }

        textField.requestFocus();
    }

    private void handleNumberButton(String number) {
        if (isResultDisplayed) {
            textField.setText("");
            isResultDisplayed = false;
        }
        textField.setText(textField.getText() + number);
    }

    private void handleOperatorButton(char op) {
        if (!textField.getText().isEmpty()) {
            if (temp != 0) {
                handleEqualsButton();
                temp = result;
            } else {
                temp = Double.parseDouble(textField.getText());
            }
            operator = op;
            isResultDisplayed = true;
        }
    }

    private void handleEqualsButton() {
        if (!textField.getText().isEmpty()) {
            temp1 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = temp + temp1;
                    break;
                case '-':
                    result = temp - temp1;
                    break;
                case '*':
                    result = temp * temp1;
                    break;
                case '/':
                    if (temp1 != 0) {
                        result = temp / temp1;
                    } else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
            temp = result;
            isResultDisplayed = true;
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            new ScientificCalculator().setVisible(true);
        });
    }
}
    

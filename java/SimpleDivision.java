import javax.swing.*;
import java.awt.event.*;

public class SimpleDivision extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, resultField;
    JButton divideButton;

    public SimpleDivision() {
        setTitle("Integer Division");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel num1Label = new JLabel("Num1:");
        num1Label.setBounds(20, 20, 50, 20);
        add(num1Label);

        num1Field = new JTextField();
        num1Field.setBounds(80, 20, 100, 20);
        add(num1Field);

        JLabel num2Label = new JLabel("Num2:");
        num2Label.setBounds(20, 50, 50, 20);
        add(num2Label);

        num2Field = new JTextField();
        num2Field.setBounds(80, 50, 100, 20);
        add(num2Field);

        divideButton = new JButton("Divide");
        divideButton.setBounds(190, 20, 80, 50);
        divideButton.addActionListener(this);
        add(divideButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 80, 50, 20);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(80, 80, 100, 20);
        resultField.setEditable(false);
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            int result = num1 / num2;
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Math Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SimpleDivision().setVisible(true);
    }
}

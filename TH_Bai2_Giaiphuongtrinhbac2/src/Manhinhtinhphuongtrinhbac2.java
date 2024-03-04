import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuadraticEquationSolver extends JFrame {
    private JLabel labelA, labelB, labelC, labelResult;
    private JTextField textFieldA, textFieldB, textFieldC;
    private JButton solveButton;

    public QuadraticEquationSolver() {
        setTitle("Quadratic Equation Solver");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        labelA = new JLabel("Enter coefficient a:");
        panel.add(labelA);
        textFieldA = new JTextField();
        panel.add(textFieldA);

        labelB = new JLabel("Enter coefficient b:");
        panel.add(labelB);
        textFieldB = new JTextField();
        panel.add(textFieldB);

        labelC = new JLabel("Enter coefficient c:");
        panel.add(labelC);
        textFieldC = new JTextField();
        panel.add(textFieldC);

        solveButton = new JButton("Solve");
        solveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                solveEquation();
            }
        });
        panel.add(solveButton);

        labelResult = new JLabel();
        panel.add(labelResult);

        add(panel);
        setVisible(true);
    }

    private void solveEquation() {
        try {
            double a = Double.parseDouble(textFieldA.getText());
            double b = Double.parseDouble(textFieldB.getText());
            double c = Double.parseDouble(textFieldC.getText());

            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                labelResult.setText("Roots are: " + root1 + " and " + root2);
            } else if (delta == 0) {
                double root = -b / (2 * a);
                labelResult.setText("Root is: " + root);
            } else {
                labelResult.setText("No real roots.");
            }
        } catch (NumberFormatException ex) {
            labelResult.setText("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new QuadraticEquationSolver();
    }
}

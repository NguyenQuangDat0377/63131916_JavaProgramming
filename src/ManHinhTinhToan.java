import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane
	
	public ManHinhTinhToan(). {
		
		public class CalculatorGUI extends JFrame implements ActionListener {
		    private JTextField numField1, numField2, resultField;
		    private JButton addButton, subButton, mulButton, divButton;

		    private CalculatorLogic calculator;

		    public CalculatorGUI() {
		        setTitle("Simple Calculator");
		        setSize(300, 200);
		        setDefaultCloseOperation(EXIT_ON_CLOSE);

		        calculator = new CalculatorLogic();

		        JPanel panel = new JPanel();
		        panel.setLayout(new GridLayout(4, 2));

		        numField1 = new JTextField(10);
		        numField2 = new JTextField(10);
		        resultField = new JTextField(10);
		        resultField.setEditable(false);

		        addButton = new JButton("+");
		        subButton = new JButton("-");
		        mulButton = new JButton("*");
		        divButton = new JButton("/");

		        addButton.addActionListener(this);
		        subButton.addActionListener(this);
		        mulButton.addActionListener(this);
		        divButton.addActionListener(this);

		        panel.add(new JLabel("Number 1:"));
		        panel.add(numField1);
		        panel.add(new JLabel("Number 2:"));
		        panel.add(numField2);
		        panel.add(new JLabel("Result:"));
		        panel.add(resultField);
		        panel.add(addButton);
		        panel.add(subButton);
		        panel.add(mulButton);
		        panel.add(divButton);

		        add(panel);
		    }

		    public void actionPerformed(ActionEvent e) {
		        int num1 = Integer.parseInt(numField1.getText());
		        int num2 = Integer.parseInt(numField2.getText());

		        if (e.getSource() == addButton) {
		            int result = calculator.add(num1, num2);
		            resultField.setText(String.valueOf(result));
		        } else if (e.getSource() == subButton) {
		            int result = calculator.subtract(num1, num2);
		            resultField.setText(String.valueOf(result));
		        } else if (e.getSource() == mulButton) {
		            int result = calculator.multiply(num1, num2);
		            resultField.setText(String.valueOf(result));
		        } else if (e.getSource() == divButton) {
		            if (num2 != 0) {
		                double result = calculator.divide(num1, num2);
		                resultField.setText(String.valueOf(result));
		            } else {
		                resultField.setText("Cannot divide by zero!");
		            }
		        }
		    }

		    public static void main(String[] args) {
		        SwingUtilities.invokeLater(() -> {
		            CalculatorGUI calculator = new CalculatorGUI();
		            calculator.setVisible(true);
		        });
		    }
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}// Het ham tao
	void HamXuLyCong() {
		// Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str soB = txtB.getText();
		// Chuyen Kieu
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		// Tinh toan
		double tong = soA+soB
		// Dua ra hien thi len dieu khien
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		// Lay du lieu tu dieu khien
				String str_soA = txtA.getText();
				String str soB = txtB.getText();
				// Chuyen Kieu
				Double soA = Double.parseDouble(str_soA);
				Double soB = Double.parseDouble(str_soB);
				// Tinh toan
				double tong = soA-soB
				// Dua ra hien thi len dieu khien
				txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyNhan() {
		// Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str soB = txtB.getText();
		// Chuyen Kieu
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		// Tinh toan
		double tong = soA*soB
		// Dua ra hien thi len dieu khien
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyChia() {
		// Lay du lieu tu dieu khien
				String str_soA = txtA.getText();
				String str soB = txtB.getText();
				// Chuyen Kieu
				Double soA = Double.parseDouble(str_soA);
				Double soB = Double.parseDouble(str_soB);
				// Tinh toan
				double tong = soA/soB
				// Dua ra hien thi len dieu khien
				txtKetQua.setText(String.valueOf(tong));
	}
}

import java.awt.EventQueue;

public class ManHinhTToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public ManHinhTToan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraGUI extends JFrame {

	public static void main(String[] args) {

		CalculadoraGUI janela = new CalculadoraGUI();

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new FlowLayout());
		// (x,y)
		janela.setSize(900, 3);
		janela.setResizable(false);

		Container painel = janela.getContentPane();

		painel.add(new JLabel("Projeto Calculadora"));

		painel.add(new JTextField(20));
		painel.add(new JButton("BOTAL"));

		janela.setVisible(true);

	}

	public CalculadoraGUI() {
		super("On");
	}

}

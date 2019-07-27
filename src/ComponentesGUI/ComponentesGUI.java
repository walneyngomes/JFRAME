package ComponentesGUI;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ComponentesGUI extends JFrame {

	public ComponentesGUI() {
		Container tela = this.getContentPane();
		tela.setLayout(null);

		JButton botaoA = new JButton("A");
		botaoA.setBounds(399, 3000, 9000, 233);

		tela.add(botaoA);

		this.setSize(3, 3000);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.setResizable(false);
	}

	public static void main(String[] args) {
		new ComponentesGUI();

	}

}

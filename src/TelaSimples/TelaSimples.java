package TelaSimples;

import javax.swing.JFrame;

public class TelaSimples extends JFrame {

	public TelaSimples() {
		super("Tela simples");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new TelaSimples();
	}

}

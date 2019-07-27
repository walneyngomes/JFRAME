package TelaSimplesComDoisConteineres;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaComPaineis extends JFrame {

	public TelaComPaineis() {
		super("Tela com paineis");

		// Containers
		Container tela = this.getContentPane();
		tela.setLayout(new FlowLayout());

		// Componentes
		JPanel painel1 = new JPanel();
		painel1.setBackground(Color.BLACK);
		painel1.setPreferredSize(new Dimension(255, 89));

		JPanel painel2 = new JPanel();

		painel2.setBackground(Color.BLUE);

		painel2.setPreferredSize(new Dimension(255, 89));

		JButton botao1 = new JButton();
		botao1.setBackground(Color.BLUE);
		botao1.setBounds(900, 900, 120, 50);

		// Add no Containers
		tela.add(painel1);
		tela.add(painel2);
		tela.add(botao1);

		this.setSize(300, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new TelaComPaineis();

	}

}

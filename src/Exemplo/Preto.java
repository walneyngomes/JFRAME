package Exemplo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class Preto extends CorGui {

	public Preto() {
		super("Preto");
		Container tela = this.getContentPane();
		tela.setLayout(new FlowLayout());

		// Componentes
		JPanel painel1 = new JPanel();
		painel1.setBackground(Color.BLACK);
		painel1.setPreferredSize(new Dimension(255, 89));
		// Add no Containers
		tela.add(painel1);
		this.setSize(300, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);

	}

}

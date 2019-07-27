package UsandoJtextFiel;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Exemplo.FactoryDeTintas;

public class UsandoJtextFiel extends JFrame {

	public JTextField informacao1;
	public JTextField informacao2;
	public JTextField informacao3;

	public UsandoJtextFiel() {

		Container tela = this.getContentPane();
		tela.setLayout(new FlowLayout(FlowLayout.LEFT));

		informacao1 = new JTextField("Digite nome cor");

		informacao1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				FactoryDeTintas tinta = new FactoryDeTintas();
				tinta.criarCorPor(informacao1.getText());

			}

		}

		);
		tela.add(informacao1);
		this.setSize(900, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new UsandoJtextFiel();
	}

}

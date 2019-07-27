package UsandoJButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UsandoJButton extends JFrame {

	public UsandoJButton() {

		Container tela = this.getContentPane();
		tela.setLayout(new FlowLayout());

		JButton botaoMgs = new JButton("Exibir mensagem");
		ActionListener acao1 = new TrataCliqueBotao();
		ActionListener acao2 = new ActionListener2();
		botaoMgs.addActionListener(acao2);
		botaoMgs.addActionListener(acao1);

		tela.add(botaoMgs);

		this.setSize(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new UsandoJButton();
	}

}

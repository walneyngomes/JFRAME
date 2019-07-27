package UsandoJButtonParte2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsandoJButton extends JFrame {

	public UsandoJButton() {

		Container tela = this.getContentPane();
		tela.setLayout(new FlowLayout());

		JButton botaoMgs = new JButton("Exibir Mensagem");
		botaoMgs.addActionListener(new TrataCliqueBotao());

		JButton botaoMgsClose = new JButton("Fechar");
		botaoMgsClose.addActionListener(new TrataCliqueBotaoFechar());

		tela.add(botaoMgsClose);
		tela.add(botaoMgs);

		this.setSize(900, 344);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsandoJButton();
	}

	class TrataCliqueBotao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showConfirmDialog(null, "BOTAO CLICADO", "VALOR", JOptionPane.PLAIN_MESSAGE);

		}

	}

}

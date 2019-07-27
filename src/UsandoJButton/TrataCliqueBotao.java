package UsandoJButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class TrataCliqueBotao implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent evento) {

		JOptionPane.showMessageDialog(null, "botao clicado", "Mensagem", JOptionPane.PLAIN_MESSAGE);

	}

}


import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class test {
	public static void main(String[] args) throws Exception {
		JLabel obj1 = new JLabel();
		JLabel obj2 = new JLabel();
		obj1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "move up");
		obj1.getActionMap().put("move up", new FireAction("w"));
		while (true) {
			Thread.sleep(1);
			obj1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "move up");
			obj1.getActionMap().put("move up", new FireAction("w"));
		}
	}
}
class FireAction extends AbstractAction{
	FireAction(String a){
		System.out.print("Was W was pressed?");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print("W was pressed");
		
	}

}

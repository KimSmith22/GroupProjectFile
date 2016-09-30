import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class WineGui extends JFrame implements ActionListener {
JButton b1;
JButton b2;
public WineGui(){
	super();	
	JOptionPane.showMessageDialog(null,"Please make a selection","Welcome to the Wine Shop!", JOptionPane.PLAIN_MESSAGE);

	setSize(600, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLookAndFeel();
	
	b1 = new JButton("Enter");
	b2 = new JButton("Exit");
	b1.addActionListener(this);
    b2.addActionListener(this);
	FlowLayout flow = new FlowLayout();
	setLayout(flow);
	add(b1);
	add(b2);
	pack();
	setVisible(true);
}

public void actionPerformed(ActionEvent evt){
	Object source = evt.getSource();
	if(source == b1){
		setTitle("Enter");
	}else if(source == b2){
		setTitle("Exit");
	}
}

private void setLookAndFeel(){
try{
	UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	SwingUtilities.updateComponentTreeUI(this);
}catch (Exception exc) {System.err.println("Couldn't use the system" + "look and feel:" + exc); }
}
public static void main(String[]arguments){
	WineGui frame = new WineGui();
    }
}


	



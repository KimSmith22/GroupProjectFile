import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


public class WineGui extends JFrame implements ActionListener {

	
	private JButton Pinot_Noir, Merlot , Reisling, Moscato;
	
	public static void main(String[] args) {
	WineGui gui = new WineGui();
	JTable winegui = new JTable();
	
		gui.setVisible(true);	// making the gui program visible

		
	}//end of main method
    
    
	public WineGui() {
		
		setTitle("The Wine Shop");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Add GUI components to let the user pick what type of wine they want.
		Pinot_Noir = new JButton("Pinot Noir");
		Merlot = new JButton("Merlot");
		Reisling = new JButton("Reisling");
		Moscato = new JButton("Moscato");
		
		Pinot_Noir.addActionListener(this);
		Merlot.addActionListener(this);
		Reisling.addActionListener(this);
		Moscato.addActionListener(this);

		Box buttons = Box.createHorizontalBox();
		buttons.add(Pinot_Noir);
		buttons.add(Merlot);
		buttons.add(Reisling);
		buttons.add(Moscato);
		this.getContentPane().add(buttons, BorderLayout.CENTER);
		
		//JTable table = new JTable(winelist, receipt);
		
    }//end of constructor
    
    public void actionPerformed(ActionEvent e) {
     
    }//end of actionPerformed method
    
}

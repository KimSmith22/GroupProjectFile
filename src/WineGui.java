import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WineGui extends JFrame {

	//creating the jframe
	JTable jt;
	String[] column_Headers={"Product Names","Product Type","Prices"};
	String[][] product_Info={ {"Villa Alena", "Moscato","6.99"},
            {"Beviano", "Moscato","9.99" },
            {"Flip Flop",  "Moscato","9.99"},
            {"Columbia Valley", "Merlot","11.99"},
            {"North Coast", "Merlot","17.99"},
            {"Mark West", "Pinot Noir","10.99"},
            {"DeLoach", "Pinot Noir","8.99"},
            {"Castle Rock", "Pinot Noir","12.99"},
            {"Murphy’s Law", "Riesling","11.99"},
            {"Washington Hills", "Riesling","7.99"},
            {"Standing Stone", "Riesling","6.99"},
            {"Bex", "Riesling","5.99"}};
	
			public WineGui() {
			}
			{
				jt = new JTable(product_Info,column_Headers);
				jt.setBounds(50,50,200,230);
				JScrollPane js = new JScrollPane(jt);
				this.add(js);//add jscroll to the table
				this.setSize(500,400);
				this.setVisible(true);
			}
	public static void main(String[]args) {
		
new WineGui();// instance of the class
	}

}

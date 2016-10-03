import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WineGui {
	
    public static void main(String[] args){
        
        
        JFrame frame = new JFrame();// creating a JFrame
        JTable table = new JTable(); //Creating a JTable to store product names,types, and prices

        // create a an array for the header of jtable
        //created 2d array of strings thats being stored in the jtable
       
        Object[] columns = {"Product Name","Product Type","Price"};// created an array for the header of the JTable
        
        String[][] product_Info={ {"Villa Alena", "Moscato","6.99"},//created 2d array for the JTable
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
        	
      	table = new JTable(product_Info,columns);//constructor for the JTable
        table.setBackground(Color.white);
        table.setForeground(new Color(147, 112, 219));//color of the text
        Font font = new Font("",1,22);
        table.setFont(new Font("Calibri", Font.BOLD, 21));
        table.setRowHeight(30);
        table.setVisible(true);
        
       
        // created JScrollPane for the JTable
        // now able to scroll along the jtable
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.getContentPane().setLayout(null);
        
        frame.getContentPane().add(pane);
        
        frame.setSize(900,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
        
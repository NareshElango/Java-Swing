package emppack;
import javax.swing.*;

//import com.mysql.cj.xdevapi.Statement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class emp implements ActionListener {
	
	JFrame f;
	JLabel l1,l2;
	JTable t1;
	JTextField t2,t3;
	JButton b1;
	emp(){
		f=new JFrame("emp");
		l1=new JLabel("enter the name");
		l1.setBounds(30,30,100,40);
		t2=new JTextField();
		t2.setBounds(250,30,100,20);
		l2=new JLabel("enter the id");
		l2.setBounds(30,70,100,40);
		t3=new JTextField();
		t3.setBounds(250,70,100,20);
		b1=new JButton("submit");
		b1.setBounds(100,150,100,60);
		b1.addActionListener(this);
		f.add(t3);
		f.add(b1);
		f.add(t2);
		f.add(l1);
		f.add(l2);
		
		
		
		
		//f.add(t1);
		f.setSize(600,600);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new emp();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(b1==e.getSource())
		{
			try {
				Class.forName("com.java.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new3","root","root");
				Statement st=con.createStatement();
				String query="insert into emp values(?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1, Integer.parseInt(t2.getText()));
				ps.setString(2, t3.getText());
				
				
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	
}

package bankpack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class add implements ActionListener{
	JFrame f;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4,t5;
	String name ;
	int acc_no;
	
	add(String name,int acc_no){
		f=new JFrame("add");
		f.setSize(800,800);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("enter the money");
		l1.setBounds(50,50,100,30);
		t3=new JTextField();
		t1=new JTextField();
		t2=new JTextField();
		t3.setBounds(200,50,100,30);
		b1=new JButton("add");
		b1.setBounds(100,100,100,30);
		b1.addActionListener(this);
		f.add(l1);
		f.add(b1);
		f.add(t3);
		f.add(t1);
		f.add(t2);
		this.name=name;
		this.acc_no=acc_no;
	}
	public static void main(String[] args) {
		//new add(String,int);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","root");
				Statement st=con.createStatement();
				String query="insert into addmoney values(?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				
				ps.setString(1,name );
				ps.setInt(2, acc_no);
				ps.setInt(3,Integer.parseInt(t3.getText()));
				ps.execute();
			}
			catch(Exception e1) {
				System.out.println(e1.toString());
			}
		}
		
	}
}
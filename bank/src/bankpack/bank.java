package bankpack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.add.*;
public class bank  implements ActionListener{
	JFrame f;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4;
	JTextField t1,t2;
	bank(){
		f= new JFrame("bank management");
		f.setSize(800,800);
		f.setVisible(true);
		f.setLayout(null);
		l1=new JLabel("your name:");
		l1.setBounds(50,50,100,30);
		t1=new JTextField();
		t1.setBounds(200,50,100,30);
		l2=new JLabel("your acc no:");
		l2.setBounds(50,100,100,30);
		t2=new JTextField();
		t2.setBounds(200,100,100,30);
		b1=new JButton("add money");
		b1.setBounds(70,150,100,40);
		b1.addActionListener(this);
		b2=new JButton("Withdraw money");
		b2.setBounds(170,150,140,40);
		b2.addActionListener(this);
		b3=new JButton("view balance");
		b3.setBounds(310,150,140,40);
		b3.addActionListener(this);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new bank();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","root");
//			Statement st=con.createStatement();
//			String query="insert into book values(?,?)";
//			PreparedStatement ps=con.prepareStatement(query);
//			ps.setString(1, t1.getText());
//			ps.setInt(2, Integer.parseInt(t2.getText()));
			add a1=new add(t1.getText(),Integer.parseInt(t2.getText()));
			//ps.execute();
			}
			catch(Exception e1) {
				System.out.println(e1.toString());
			}
		}
		if(e.getSource()==b2) {
		
	}
		if(e.getSource()==b3) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","root");
				Statement st=con.createStatement();
				String qu="select *from addmoney";
				ResultSet rs=st.executeQuery(qu);
				while(rs.next())
				{
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				}
				}
				catch(Exception e1) {
					System.out.println(e.toString());
				}
		}
}
}
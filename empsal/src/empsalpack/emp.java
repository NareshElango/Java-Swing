package empsalpack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class emp implements ActionListener{
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5;
	JComboBox cb1,cb2,cb3;
	emp(){
		
		f=new JFrame("employee details");
		f.setVisible(true);
		f.setSize(700,700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("name");
		l1.setBounds(100,100,50,30);
		t1=new JTextField();
		t1.setBounds(150,100,70,30);
		l2=new JLabel("address");
		l2.setBounds(100,150,50,30);
		t2=new JTextField();
		t2.setBounds(150,150,70,30);
		l3=new JLabel("hour");
		l3.setBounds(100,200,50,30);
		t3=new JTextField();
		t3.setBounds(150,200,70,30);
		l4=new JLabel("no of working hrs");
		l4.setBounds(100,250,50,30);
		t4=new JTextField();
		t4.setBounds(150,250,70,30);
		b1=new JButton("calculate");
		b1.setBounds(150,300,150,50);
		b1.addActionListener(this);
		t5=new JTextField();
		t5.setBounds(150,350,70,50);
		b2=new JButton("submit");
		b2.setBounds(150,450,150,50);
		b2.addActionListener(this);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		
		
	}
	public static void main(String[] args) {
		new emp();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			String a=t3.getText();
			String b=t4.getText();
			int c=Integer.parseInt(a);
			int d=Integer.parseInt(b);
			int e1=0;
			e1=c*d;
			String h=Integer.toString(e1);
			t5.setText(h);
		}
		if(e.getSource()==b2) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","root");
				Statement st=con.createStatement();
				String query="insert into emp values(?,?,?,?,?)";
				String resu="select * from emp";
				//ResultSet rs=st.executeQuery("resu");
				PreparedStatement preparedStatement = con.prepareStatement(query);
				preparedStatement.setString(1, t1.getText());
				preparedStatement.setString(2, t2.getText());
				preparedStatement.setInt(3, Integer.parseInt(t3.getText()));
				preparedStatement.setInt(4, Integer.parseInt(t4.getText()));
				preparedStatement.setInt(5, Integer.parseInt(t5.getText()));
				preparedStatement.execute();
//				while(rs.next()) {
//					System.out.println(rs.getString(1)+"/t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
//					con.close();
//				}
			}
			catch(Exception e2) {
				System.out.println(e2.toString());
			}
		}
		
	}
	
}
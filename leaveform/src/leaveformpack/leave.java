package leaveformpack;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;    
public class leave implements ActionListener{
	JFrame f;
	JComboBox c;
	JRadioButton r1,r2,r3,r4;
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4,l5,l6;
	JRadioButton rb1,rb2,rb3,rb4;
	JButton b1;
	JOptionPane p;
	leave(){
		f=new JFrame("Leave Form");
		l1=new JLabel("Name:");
		l1.setBounds(50,50,100,30);
		t1=new JTextField();
		t1.setBounds(170,50,100,30);
		l2=new JLabel("Reg_no:");
		l2.setBounds(50,100,100,30);
		t2=new JTextField();
		t2.setBounds(170,100,100,30);
		l3=new JLabel("choose the dept:");
		l3.setBounds(50,150,100,30);
		String dept[]= {
				"CSE","METT","CIVIL","ECE","EEE","MECH"
				};
		c=new JComboBox(dept);
		c.setBounds(170, 150, 100, 30);
		l4=new JLabel("enter the date:");
		l4.setBounds(50, 250, 100, 30);
		t3=new JTextField();
		t3.setBounds(170,250,100,30);
		l5=new JLabel("To");
		l5.setBounds(270,250,100,30);
		t4=new JTextField();
		t4.setBounds(290,250,100,30);
		rb1=new JRadioButton("I year");
		rb2=new JRadioButton("II year");
		rb3=new JRadioButton("III year");
		rb4=new JRadioButton("IV year");
		l6=new JLabel("choose the year:");
		l6.setBounds(50,200,100,30);
		rb1.setBounds(170,200,100,30);
		rb2.setBounds(270,200,100,30);
		rb3.setBounds(370,200,100,30);
		rb4.setBounds(490,200,100,30);
		b1=new JButton("Submit");
		b1.setBounds(170,330,100,30);
		b1.addActionListener(this);
		
		
		f.setVisible(true);
		f.setSize(750,750);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(c);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(l6);
		f.add(rb1);
		f.add(rb2);
		f.add(rb3);
		f.add(rb4);
		f.add(b1);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			
		p.showMessageDialog(null, getpanel(),"Messsage",3);
//			
			
			
		}
	 
	
	}
	public  JPanel  getpanel() {
		 JPanel panel=new JPanel(new GridLayout(0, 1, 5, 5));
		 String a=t1.getText();
			String b=t2.getText();
			String d=(String) c.getItemAt(c.getSelectedIndex());
			String e1=t3.getText();
			String e2=t4.getText();
			JLabel n=new JLabel("Name:"+a);
			JLabel r=new JLabel("Reg_no:"+b);
			JLabel d1=new JLabel("Dept:"+d);
			JLabel f=new JLabel("leave from:"+e1);
			JLabel g=new JLabel("to:"+e2);
			panel.add(n);
			panel.add(r);
			panel.add(d1);
			panel.add(f);
			panel.add(g);
			return panel;
		 
	 }
	public static void main(String[] args) {
		new leave();
	}
}
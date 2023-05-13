package buttonpack;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class button implements ActionListener{
	JFrame f;
	JButton b1,b2,b3;
	button(){
		f=new JFrame("button");
		b1=new JButton("red");
		b1.setBounds(30,30,100,30);
		b2=new JButton("blue");
		b2.setBounds(40,100,100,30);
		b3=new JButton("green");
		b3.setBounds(40,170,100,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(b1);
		f.add(b2);
		f.add(b3);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(b1==e.getSource())
			f.getContentPane().setBackground(Color.red);
		if(b2==e.getSource())
			f.getContentPane().setBackground(Color.blue);
		if(b3==e.getSource())
			f.getContentPane().setBackground(Color.green);
			
		
	}
	public static void main(String[] args) {
		new button();
	}
}
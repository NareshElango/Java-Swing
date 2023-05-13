package borderlayoupack;
import java.awt.*;
import javax.swing.*;
public class border {
	JFrame f;
	JButton b1,b2,b3,b4,b5;
	border(){
		f=new JFrame("BorderLayout ex");
		b1=new JButton("north");
		b2=new JButton("south");
		b3=new JButton("east");
		b4=new JButton("west");
		b5=new JButton("center");
		f.setLayout(new BorderLayout(20,15));
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new border();
	}
}

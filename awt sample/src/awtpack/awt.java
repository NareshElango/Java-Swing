package awtpack;
import java.awt.*;
public class awt {
	Frame f;
	TextField t;
	awt(){
		f=new Frame("sample");
		t=new TextField();
		t.setBounds(10,10,100,40);
		f.add(t);
		f.setVisible(true);
		f.setLayout(null);
		f.setD
		f.setSize(500,500);
	}
	public static void main(String[] args) {
		new awt();
	}
}
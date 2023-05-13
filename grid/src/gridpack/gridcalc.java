package gridpack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class gridcalculator extends JFrame implements ActionListener{
    String str="",e="";
    int x,y,z;
    JLabel t = new JLabel("Result");
    JButton[] b= new JButton[15];
    gridcalculator(){
        setTitle("Calculator");
        setLayout(new GridLayout(4,4,10,10));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);

        for(int i=0; i<10 ; i++){
            add(b[i]= new JButton(i+""));
        }
        add(b[10] = new JButton("+"));
        add(b[11] = new JButton("-"));
        add(b[12] = new JButton("*"));
        add(b[13] = new JButton("/"));
        add(b[14] = new JButton("="));
        add(t);
        for(int i=0 ;i<15;i++){
            b[i].addActionListener(this);
        }
}
public void actionPerformed(ActionEvent ae)
{
    if (ae.getSource()==b[0]){
        str+="0";
    }
    if (ae.getSource()==b[1]){
        str+="1";
    }
    if (ae.getSource()==b[2]){
        str+="2";
    }
    if (ae.getSource()==b[3]){
        str+="3";
    }
    if (ae.getSource()==b[4]){
        str+="4";
    }
    if (ae.getSource()==b[5]){
        str+="5";
    }
    if (ae.getSource()==b[6]){
        str+="6";
    }
    if (ae.getSource()==b[7]){
        str+="7";
    }
    if (ae.getSource()==b[8]){
        str+="8";
    }
    if (ae.getSource()==b[9]){
        str+="9";
    }
    if (ae.getSource()==b[10]){
        str+="+";
        e="+";
        z=str.indexOf("+");
    }
    if (ae.getSource()==b[11]){
        str+="-";
        e="-";
        z=str.indexOf("-");
    }
    if (ae.getSource()==b[12]){
        str+="*";
        e="*";
        z=str.indexOf("*");
    }
    if (ae.getSource()==b[13]){
        str+="/";
        e="/";
        z=str.indexOf("/");
    }
    if (ae.getSource()==b[14]){
        str+="=";
        String c,d;
        c=str.substring(0,z);

        d=str.substring(z+1,str.length()-1);
        x=Integer.parseInt(c);
        y=Integer.parseInt(d);
        if(e.equals("+")){
            str+=(x+y)+"";

        }
        if(e.equals("-")){
            str+=(x-y)+"";

        }
        if(e.equals("*")){
            str+=(x*y)+"";

        }
        if(e.equals("/")){
            try {
                if (y > 0) {
                    str += (x / y) + "";
                }
            }catch (ArithmeticException e){

            }
        }
        t.setText(str);
        str="";
        c="";
        d="";
        e="";
        x=0;
        y=0;
        z=0;
    }
}

}
public class gridcalc {
    public static void main(String[] args){
        gridcalculator cal = new gridcalculator();
    }

}
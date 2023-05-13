package calandarpack;
import java.util.*;

import javax.swing.JFrame;
public class calandar{
	JFrame f;
	calandar(){
		f=new JFrame();
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		 
		f.add(datePicker);
		f.setVisible(true);
		f.setBounds(500,500);
	}
}

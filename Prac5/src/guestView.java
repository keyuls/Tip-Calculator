import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class guestView {

	JButton homeGo = new JButton("Home");
	JComponent panel = new JPanel();
	public JButton getHomeGo() {
		return homeGo;
	}
	public void setHomeGo(JButton homeGo) {
		this.homeGo = homeGo;
	}
	static int  county=0;
	static float  perpersontip=0;
	static int minRange =0;
	static int maxRange=0;

	
//------------------------//	
public guestView(int count, float perpersontips ,int max){
	county = count;
	perpersontip= perpersontips;
//	minRange=min;
	maxRange=max;
	prepareGUI();
 }

JTextField[] fields = new JTextField[100];
JSlider[] field = new JSlider[100];

float[] g1Value = new float[100];  


public JSlider[] getField() {
	return field;
}
public void setField(JSlider[] field) {
	this.field = field;
}

JLabel[] perPeart = new JLabel[100];

public JLabel[] getPerPeart() {
	return perPeart;
}
public void setPerPeart(JLabel[] perPeart) {
	this.perPeart = perPeart;
}


public JTextField[] getFields() {
	return fields;
}
public void setFields(JTextField[] fields) {
	this.fields = fields;
}

JFrame mainFrame = new JFrame("Guest Screen");



public void prepareGUI(){

	
mainFrame.setSize(500,500);
mainFrame.setLayout(new GridLayout(1,1));
GroupLayout layout = new GroupLayout(panel);
panel.setLayout(layout);


int i ;

for (i = 0; i < county; ++i)
{
	
	  	final int k=i;
	  	fields[i] = new JTextField(6);
	   	fields[i].setBounds(50, 15 + i * 30, 120, 20);	  	
		panel.add(fields[i]);
		
          field[i] = new JSlider(0,maxRange,(int)perpersontip);
          field[i].setBounds(240, 15 + i * 30, 120, 20);
          panel.add(field[i]);
          
                
          perPeart[i] = new JLabel(Float.toString(perpersontip));
          perPeart[i].setBounds(380, 15 + i * 30, 120, 20);
          //perPeart[i].setText();
          panel.add(perPeart[i]);
          
          g1Value[i]= perpersontip;  
		field[i].addChangeListener(new ChangeListener() {
	         public void stateChanged(ChangeEvent e) {
	        	 
	        	
	           g1Value[k]=((JSlider)e.getSource()).getValue();
	           perPeart[k].setText(Float.toString(g1Value[k]));
	          // calculateTip();
	         }});
    

          
          
}

homeGo.setBounds(300, 150 + i * 20, 120, 20);


///////////




/////////
mainFrame.setVisible(true); 
panel.add(homeGo);


mainFrame.add(panel);

}
	
}
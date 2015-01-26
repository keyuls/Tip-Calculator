
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class adjustmentView {

	
	JComponent panel = new JPanel();
	JTextField minPercent= new JTextField(6); 
    
    static int tsv=0;
    static int dsv=0;
   
    JCheckBox chkTax = new JCheckBox("" );
    JCheckBox chkDeduction = new JCheckBox("");
    
    
    JLabel  minPlabel= new JLabel("Minimum tip %", JLabel.LEFT);
    JLabel  maxPlabel = new JLabel("Maximum tip % ", JLabel.LEFT);
    JLabel  intaxlabel= new JLabel("Include Tax", JLabel.LEFT);
    JLabel  indedlabel= new JLabel("Include Deduction", JLabel.LEFT);
    

	public JTextField getMinPercent() {
		return minPercent;
	}
	public JCheckBox getChkTax() {
		return chkTax;
	}
	public void setChkTax(JCheckBox chkTax) {
		this.chkTax = chkTax;
	}
	public JCheckBox getChkDeduction() {
		return chkDeduction;
	}
	public void setChkDeduction(JCheckBox chkDeduction) {
		this.chkDeduction = chkDeduction;
	}
	public void setMinPercent(JTextField minPercent) {
		this.minPercent = minPercent;
	}
	public JTextField getMaxPercent() {
		return maxPercent;
	}
	public void setMaxPercent(JTextField maxPercent) {
		this.maxPercent = maxPercent;
	}
	public JButton getHomeGo() {
		return homeGo;
	}
	public void setHomeGo(JButton homeGo) {
		this.homeGo = homeGo;
	}

	JTextField maxPercent= new JTextField(6);
	JButton homeGo = new JButton("Home");
	
	
	public adjustmentView(int ts , int ds){
	          tsv=ts;
	      dsv=ds;
	      
	      if(tsv==1)
	      {
	    	//  tf= true;
	    	  
	    	  chkTax.setSelected(true);
	      } 
	      
	      if(dsv==1)
	      {
	    	  chkDeduction.setSelected(true);
	      } 
	      
	      prepareGUI();
		  
	   }
	 
	 JFrame mainFrame = new JFrame("Adjust Screen");
	 public void prepareGUI(){

	 
 mainFrame.setSize(500,500);
 mainFrame.setLayout(new GridLayout(1,1));
// panel.setLayout(new FlowLayout());

 GroupLayout layout = new GroupLayout(panel);
 panel.setLayout(layout);

 minPercent.setBounds(300, 50, 120, 20);
 maxPercent.setBounds(300, 80, 120, 20);
 chkTax.setBounds(300, 130, 120, 20);
 chkDeduction.setBounds(300, 180, 120, 20);
 homeGo.setBounds(300, 230, 120, 20);
 
 
 minPlabel.setBounds(100, 50, 120, 20);
 maxPlabel.setBounds(100, 80, 120, 20);
 intaxlabel.setBounds(100, 130, 120, 20);
 indedlabel.setBounds(100, 180, 120, 20);
 
 
 panel.add(minPercent);
 panel.add(maxPercent);
 panel.add(chkTax);
 panel.add(chkDeduction);
 panel.add(homeGo);
 
 panel.add(minPlabel);
 panel.add(maxPlabel);
 panel.add(intaxlabel);
 panel.add(indedlabel);
 
 mainFrame.add(panel);
 mainFrame.setVisible(true); 	
	 }	
	
}

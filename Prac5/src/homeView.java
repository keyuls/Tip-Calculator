import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JTextField;


public class homeView {

	JComponent panel = new JPanel();
	JTextField NoOfGuest= new JTextField(6); 
	JTextField TotalBill= new JTextField(6);
	JTextField Tax = new JTextField(6);
	JTextField Deduction = new JTextField(6);
	JSlider Qos = new JSlider(0,100,0);
	JLabel TipRate = new JLabel("");
	JLabel TotalTip = new JLabel("") ;
	JLabel perPersonTip  = new JLabel("");
	JLabel totalBillandTip  = new JLabel("");
	JButton guestGo = new JButton("Guest");
	
	
	
	JLabel  totalBilllabel= new JLabel("Cost Of Bill: ", JLabel.LEFT);
    JLabel  guestLabel = new JLabel("No. of Guest: ", JLabel.LEFT);
    JLabel  qoslabel= new JLabel("Quality of Service: ", JLabel.LEFT);
    JLabel  taxLabel = new JLabel("Tax Amount: ", JLabel.LEFT);
    JLabel  deductionLabel = new JLabel("Deduction: ", JLabel.LEFT);
    
    JLabel  tipRateLabel = new JLabel("Tip Rate: ", JLabel.LEFT);
    JLabel  totalTipLabel = new JLabel("Total Tip: ", JLabel.LEFT);
    JLabel  perPersonTipLabel = new JLabel("Per Person Tip: ", JLabel.LEFT);
    JLabel  totalBillLabel = new JLabel("Total (Bill , Tax and Tip): ", JLabel.LEFT);
    
    	      

	
	public JButton getGuestGo() {
		return guestGo;
	}
	public void setGuestGo(JButton guestGo) {
		this.guestGo = guestGo;
	}
	public JButton getAdjstGo() {
		return adjstGo;
	}
	public void setAdjstGo(JButton adjstGo) {
		this.adjstGo = adjstGo;
	}

	JButton adjstGo = new JButton("Adjust");
	
	public JTextField getNoOfGuest() {
		return NoOfGuest;
	}
	public void setNoOfGuest(JTextField noOfGuest) {
		NoOfGuest = noOfGuest;
	}
	public JTextField getTotalBill() {
		return TotalBill;
	}
	public void setTotalBill(JTextField totalBill) {
		TotalBill = totalBill;
	}
	public JTextField getTax() {
		return Tax;
	}
	public void setTax(JTextField tax) {
		Tax = tax;
	}
	public JTextField getDeduction() {
		return Deduction;
	}
	public void setDeduction(JTextField deduction) {
		Deduction = deduction;
	}
	public JSlider getQos() {
		return Qos;
	}
	public void setQos(JSlider qos) {
		Qos = qos;
	}
	public JLabel getTipRate() {
		return TipRate;
	}
	public void setTipRate(JLabel tipRate) {
		TipRate = tipRate;
	}
	public JLabel getPerPersonTip() {
		return perPersonTip;
	}
	public void setPerPersonTip(JLabel perPersonTip) {
		this.perPersonTip = perPersonTip;
	}
	
	public JLabel getTotalTip() {
		return TotalTip;
	}
	public void setTotalTip(JLabel totalTip) {
		TotalTip = totalTip;
	}
	public JLabel getTotalBillandTip() {
		return totalBillandTip;
	}
	public void setTotalBillandTip(JLabel totalBillandTip) {
		this.totalBillandTip = totalBillandTip;
	}

	
	public homeView(){
	      prepareGUI();
	   }
	 
	 JFrame mainFrame = new JFrame("Home Screen");
	 public void prepareGUI(){

	 
   mainFrame.setSize(500,500);
   mainFrame.setLayout(new GridLayout(1,1));
  // panel.setLayout(new FlowLayout());
  
  GroupLayout layout = new GroupLayout(panel);
   panel.setLayout(layout);
   
   
   
   
   ////



   
   ///
   NoOfGuest.setBounds(300, 50, 120, 20);
   panel.add(NoOfGuest);
   Qos.setBounds(300, 80, 120, 20); 
  panel.add(Qos);
  TotalBill.setBounds(300, 130, 120, 20);
   panel.add(TotalBill);
   Tax.setBounds(300, 180, 120, 20);
   
   panel.add(Tax);
   Deduction.setBounds(300, 230, 120, 20);
   
   panel.add(Deduction);
   TipRate.setBounds(300, 270, 120, 20);
   panel.add(TipRate);
   
   TotalTip.setBounds(300, 310, 120, 20);
   panel.add(TotalTip);
   
   perPersonTip.setBounds(300, 350, 120, 20);
   panel.add(perPersonTip);
   totalBillandTip.setBounds(300, 390, 120, 20);
   
   panel.add(totalBillandTip);
   adjstGo.setBounds(100, 420, 120, 20);
   
   panel.add(adjstGo);
   guestGo.setBounds(300, 420, 120, 20);
 
  panel.add(guestGo);
   

  guestLabel.setBounds(100, 50, 120, 20);
  qoslabel.setBounds(100, 80, 120, 20);
  totalBilllabel.setBounds(100, 130, 120, 20);
  taxLabel.setBounds(100, 180, 120, 20);
  deductionLabel.setBounds(100, 230, 120, 20);
  perPersonTipLabel.setBounds(100, 350, 120, 20);
  tipRateLabel.setBounds(100, 270, 120, 20);
  totalTipLabel.setBounds(100, 310, 120, 20);
  totalBillLabel.setBounds(100, 390, 120, 20);
  
  
 panel.add(guestLabel);
 panel.add(qoslabel);
 panel.add(totalBilllabel);
 panel.add(taxLabel);
 panel.add(deductionLabel);
 panel.add(perPersonTipLabel);
 panel.add(tipRateLabel);
 panel.add(totalTipLabel);
 panel.add(totalBillLabel);
   
   
   
   
   
   mainFrame.add(panel);
   
   mainFrame.setVisible(true); 
   

	
	 }	
}

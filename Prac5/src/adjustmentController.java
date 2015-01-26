import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class adjustmentController {

	JTextField minPercent= new JTextField(6); 
	JCheckBox chkTax = new JCheckBox("");
    JCheckBox chkDeduction = new JCheckBox("");
    
//    homeModel ma = new homeModel();
//    public homeModel getMa() {
//		return ma;
//	}
//
//	public void setMa(homeModel ma) {
//		this.ma = ma;
//	}

	public JTextField getMinPercent() {
		return minPercent;
	}

	public void setMinPercent(JTextField minPercent) {
		this.minPercent = minPercent;
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
	JButton homeGo = new JButton("");
	
	
	int minPercentv;
	public int getMinPercentv() {
		return minPercentv;
	}

	public void setMinPercentv(int minPercentv) {
		this.minPercentv = minPercentv;
	}

	public int getMaxPercentv() {
		return maxPercentv;
	}

	public void setMaxPercentv(int maxPercentv) {
		this.maxPercentv = maxPercentv;
	}

	int maxPercentv;
	int deduct=0;
	int guest=0;
	public int getDeduct() {
		return deduct;
	}

	public void setDeduct(int deduct) {
		this.deduct = deduct;
	}

	public int getGuest() {
		return guest;
	}

	public void setGuest(int guest) {
		this.guest = guest;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getQos() {
		return qos;
	}

	public void setQos(int qos) {
		this.qos = qos;
	}

	public int getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}

	int tax=0;
	int qos=0;
	int totalBill=0;
	
	String[] guestlist = new String[100];

	public String[] getGuestlist() {
	return guestlist;
}

public void setGuestlist(String[] guestlist) {
	this.guestlist = guestlist;
}

String[] perTipList = new String[100];


public String[] getPerTipList() {
	return perTipList;
}

public void setPerTipList(String[] perTipList) {
	this.perTipList = perTipList;
}


 int taxStatus =0;
 int deductStatus=0;
 
	public int getTaxStatus() {
	return taxStatus;
}

public void setTaxStatus(int taxStatus) {
	this.taxStatus = taxStatus;
}

public int getDeductStatus() {
	return deductStatus;
}

public void setDeductStatus(int deductStatus) {
	this.deductStatus = deductStatus;
}


float TotalTip=0;


	public float getTotalTip() {
	return TotalTip;
}

public void setTotalTip(float totalTip) {
	TotalTip = totalTip;
}

	public void adjustV()
	
	{
		
		
		adjustmentView va = new adjustmentView( getTaxStatus() ,getDeductStatus());
		
		va.minPercent.setText(Integer.toString(getMinPercentv()));
		va.maxPercent.setText(Integer.toString(getMaxPercentv()));
		
		
		//va.setChkTax(getChkTax());
		
		setMinPercent(va.getMinPercent());
		setMaxPercent(va.getMaxPercent());
		
		
		setChkTax(va.getChkTax());
		setChkDeduction(va.getChkDeduction());
		
		setHomeGo(va.getHomeGo());
		
		
		homeGo.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) { 
		     	
		     	 				
		 	homeModel ma = new homeModel();
		 	ma.setDeduction(getDeduct());
		 	ma.setTax(getTax());
		 	ma.setQos(getQos());
		 	ma.setNoOfGuest(getGuest());
		 	ma.setTotalBill(getTotalBill());
		 	ma.setTotalTip(getTotalTip());
		 		
		 	ma.setMinP(Integer.parseInt(getMinPercent().getText()));		
			ma.setMaxP(Integer.parseInt(getMaxPercent().getText()));	
			
			if(chkTax.isSelected())
			{
				setTaxStatus(1);
			}	
			
			else{
				setTaxStatus(0);
			}
			
			if(chkDeduction.isSelected())
			{
				setDeductStatus(1);
			}	
			else{
				setDeductStatus(0);
			}
			
		//	System.out.println(getTaxStatus());
			
			ma.setTaxStatus(getTaxStatus());
			ma.setDeductStatus(getDeductStatus());
			
		
			
			ma.setGuestlist(getGuestlist());
			ma.setPerTipList(getPerTipList());
			
			
		  		ma.homeControl();
		  		
					va.mainFrame.dispose();
		      }  
		      });


	//------------------//
		
		//------Check Box-------//		      
	      
	     
	   //   chkTax.setMnemonic(KeyEvent.VK_C);
	    //  chkDeduction.setMnemonic(KeyEvent.VK_M);
	   /*   
	      chkTax.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	        	 System.out.println();
	        	 System.out.println(e.getStateChange());
	          setTaxStatus( e.getStateChange());
	           
	          		         }           
	      });

	      chkDeduction.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {             
	       
	        	 setDeductStatus( e.getStateChange()); 
	        //	 calculatePerPersonTip();
	     		 
	         }           
	      });

	     */ 
	     

		
		
	}
	
}

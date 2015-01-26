import java.awt.EventQueue;

import javax.swing.JTextField;


public class adjustmentModel {

	int minPercent=0;
	int maxPercent=100;
	


	public int getMinPercent() {
		return minPercent;
	}


	public void setMinPercent(int minPercent) {
		this.minPercent = minPercent;
	}


	public int getMaxPercent() {
		return maxPercent;
	}


	public void setMaxPercent(int maxPercent) {
		this.maxPercent = maxPercent;
	}
	

	int deduction=0;
	public int getDeduction() {
		return deduction;
	}


	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}


	public int getNoOfGuest() {
		return noOfGuest;
	}


	public void setNoOfGuest(int noOfGuest) {
		this.noOfGuest = noOfGuest;
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
		return totalbill;
	}


	public void setTotalBill(int totalbill) {
		this.totalbill = totalbill;
	}


	int noOfGuest=0;
	int tax=0;
	int qos=0;
	int totalbill=0;
	float totalTip=0;
	
	public float getTotalTip() {
		return totalTip;
	}


	public void setTotalTip(float totalTip) {
		this.totalTip = totalTip;
	}


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


 int taxStatus=0;
 int deductStaus=0;
	
	public int getTaxStatus() {
	return taxStatus;
}


public void setTaxStatus(int taxStatus) {
	this.taxStatus = taxStatus;
}


public int getDeductStaus() {
	return deductStaus;
}


public void setDeductStaus(int deductStaus) {
	this.deductStaus = deductStaus;
}


	adjustmentController ac = new adjustmentController();

	
	
	public  void adjustControl(){
		 EventQueue.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	        	 
	        	 		ac.setMaxPercentv(getMaxPercent());
	        	 		ac.setMinPercentv(getMinPercent());
	        	 		
	        	 		ac.setDeduct(getDeduction());
	        	 		ac.setTax(getTax());
	        	 		ac.setGuest(getNoOfGuest());
	        	 		ac.setQos(getQos());
	        	 		ac.setTotalBill(getTotalBill());
	        	 		ac.setTotalTip(getTotalTip());
	        	 		
	        	 		ac.setGuestlist(getGuestlist());
	        	 		ac.setPerTipList(getPerTipList());
	        	 		
	        	 		ac.setTaxStatus(getTaxStatus());
	        	 		ac.setDeductStatus(getDeductStaus());
	        	 		
	             		ac.adjustV();
	     		
	         }
	     });
	}
	
	
	
	//--------------------------//

	
	
	
	
	
}
	
	






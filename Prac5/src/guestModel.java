import java.awt.EventQueue;

import javax.swing.JTextField;


public class guestModel {
	
	int minPercent=0;
	int maxPercent=100;
	int deduct=0;
	int guest=0;
	float perPersonTip=0;
	int taxStatus=0;
	int deductStatus=0;
	
	public int getDeductStatus() {
		return deductStatus;
	}

	public void setDeductStatus(int deductStatus) {
		this.deductStatus = deductStatus;
	}

	public int getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(int taxStatus) {
		this.taxStatus = taxStatus;
	}

	public float getPerPersonTip() {
		return perPersonTip;
	}

	public void setPerPersonTip(float perPersonTip) {
		this.perPersonTip = perPersonTip;
	}

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

float[] slideList = new float[100];


public float[] getSlideList() {
	return slideList;
}

public void setSlideList(float[] slideList) {
	this.slideList = slideList;
}


	guestController gc = new guestController();

	
	
	public  void guestControl(){
		 EventQueue.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	        	 
	        	 		gc.setMaxPercent(getMaxPercent());
	        	 		gc.setMinPercent(getMinPercent());
	        	 	
	        	 		gc.setDeduct(getDeduct());
	        	 		gc.setTax(getTax());
	        	 		gc.setGuest(getGuest());
	        	 		gc.setQos(getQos());
	        	 		gc.setTotalBill(getTotalBill()); 
	        	 		gc.setPerPersonTip(getPerPersonTip());
	        	 		
	        	 		gc.setGuestlist(getGuestlist());
	        	 		gc.setPerTipList(getPerTipList());
	        	 		gc.setSlideList(getSlideList());
	        	 		
	        	 		gc.setTaxStaus(getTaxStatus());
	        	 		gc.setDeductStatus(getDeductStatus());
	        	 		
	        	 		
	             		gc.guestV();
	     		
	         }
	     });
	}

	

	
}

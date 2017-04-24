

import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;



public class homeModel {
	
	int NoOfGuest=0;
	int TotalBill=0;
	int Tax=0;
	int Deduction=0;
	int Qos=0;
	float TipRate=0;
	float perPersonTip=0;
	float totalBillandTip=0;
	float totalTip=0;
	int minP=0;
	int maxP=100;
	
	
	String[] guestlist = new String[100];

	public String[] getGuestlist() {
	return guestlist;
}

public void setGuestlist(String[] guestlist) {
	this.guestlist = guestlist;
}

float[] slideList = new float[100];


public float[] getSlideList() {
	return slideList;
}

public void setSlideList(float[] slideList) {
	this.slideList = slideList;
}
	
	
	
	public int getMaxP() {
		return maxP;
	}

	public void setMaxP(int maxP) {
		this.maxP = maxP;
	}

	public int getMinP() {
		return minP;
	}

	public void setMinP(int minP) {
		this.minP = minP;
	}

	public int getNoOfGuest() {
		return NoOfGuest;
	}

	public void setNoOfGuest(int noOfGuest) {
		NoOfGuest = noOfGuest;
	}

	public int getTotalBill() {
		return TotalBill;
	}

	public void setTotalBill(int totalBill) {
		TotalBill = totalBill;
	}

	public int getTax() {
		return Tax;
	}

	public void setTax(int tax) {
		Tax = tax;
	}

	public int getDeduction() {
		return Deduction;
	}

	public void setDeduction(int deduction) {
		Deduction = deduction;
	}

	public int getQos() {
		return Qos;
	}

	public void setQos(int qos) {
		Qos = qos;
	}

	public float getTipRate() {
		return TipRate;
	}

	public void setTipRate(float tipRate) {
		TipRate = tipRate;
	}

	public float getPerPersonTip() {
		return perPersonTip;
	}

	public void setPerPersonTip(float perPersonTip) {
		this.perPersonTip = perPersonTip;
	}

	public float getTotalBillandTip() {
		return totalBillandTip;
	}

	public void setTotalBillandTip(float totalBillandTip) {
		this.totalBillandTip = totalBillandTip;
	}

	public float getTotalTip() {
		return totalTip;
	}

	public void setTotalTip(float totalTip) {
		this.totalTip = totalTip;
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

	String[] perTipList = new String[100];


	public String[] getPerTipList() {
		return perTipList;
	}

	public void setPerTipList(String[] perTipList) {
		this.perTipList = perTipList;
	}



	
	homeController hc = new homeController();

	
	public  void homeControl(){
		 EventQueue.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            hc.setMinP(getMinP()); 
	            hc.setMaxP(getMaxP()); 
	        	hc.setNoOfGuestv(getNoOfGuest());
	        	hc.setDeductionv(getDeduction());
	        	hc.setTaxv(getTax());
	        	hc.setQosv(getQos());
	        	hc.setTipRatev(getTipRate());
	        	hc.setTotalTipv(getTotalTip());
	        	hc.setTotalBillv(getTotalBill());
	        	hc.setTotalBillandTipv(getTotalBillandTip());
	        	hc.setGuestlist(getGuestlist());
	        	hc.setPerTipList(getPerTipList());
	        	hc.setSlideList(getSlideList());
	        	hc.setTaxStatus(getTaxStatus());
	        	hc.setDeductStatus(getDeductStatus());	        	
	     		hc.homeV();
	     		
	         }
	     });
	}
	
	
	int t=0;
	
	
	

	float calculateTipRate()
	{
		int newbill;
		int taxa = getTax();
		int dded = getDeduction();
		int bill = getTotalBill();


		if(getTaxStatus()==0 ){
			taxa=0;	
		}

		if(getDeductStatus()==0 ){
			dded=0;	
		}
		newbill= ((taxa + bill) - dded);
		float rate=0;

		if(newbill!=0)
		{		
		try{
		 rate = (float)((getQos()*100)/newbill);


		}
		catch(NumberFormatException ex){
			System.out.println("error");

		}
		}	
		return rate;
	}

	float calculateperPersonTip()
	{


		int g =0;
		float  c=0;
		try{
		g=getNoOfGuest();

	if (g!=0)
	{
		    c =(getQos()/g);
	}

		}

		catch(NumberFormatException ex)
		{

			g=0;
		}

	return c;

	}

int calculateTotalBillandTip()
{
	int newbill=0;
	int taxa = getTax();
	int dded = getDeduction();
	int bill = getTotalBill();
	
	//System.out.println("model");
	//System.out.println(getTaxStatus());
	

	if(getTaxStatus()==0 )
		
	{
	taxa=0;	
	
	}
	
	 if(getDeductStatus()==0 )
		
	{
	dded=0;	
	}

	
	newbill= ((taxa + bill) - dded);
	
	int finbill = newbill + (int)getTotalTip();
	return finbill;
}
}

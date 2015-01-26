import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;





public class homeController {

	JTextField NoOfGuest= new JTextField(6); 
	JTextField TotalBill= new JTextField(6);
	JTextField Tax = new JTextField(6);
	JTextField Deduction = new JTextField(6);
	JSlider Qos = new JSlider(0,5,0);
	JLabel TipRate = new JLabel("");
	JLabel TotalTip = new JLabel("") ;
	JLabel perPersonTip  = new JLabel("");
	JLabel totalBillandTip  = new JLabel("");
	JButton guestGo = new JButton("");
	JButton adjstGo = new JButton("");

	
	int NoOfGuestv;
	int TotalBillv;
	int Taxv;
	int Deductionv;
	int Qosv;
	float TipRatev;
	float perPersonTipv;
	float totalBillandTipv;
	float totalTipv;
	
	
	
	public int getNoOfGuestv() {
		return NoOfGuestv;
	}



	public void setNoOfGuestv(int noOfGuestv) {
		NoOfGuestv = noOfGuestv;
	}



	public int getTotalBillv() {
		return TotalBillv;
	}



	public void setTotalBillv(int totalBillv) {
		TotalBillv = totalBillv;
	}



	public int getTaxv() {
		return Taxv;
	}



	public void setTaxv(int taxv) {
		Taxv = taxv;
	}



	public int getDeductionv() {
		return Deductionv;
	}



	public void setDeductionv(int deductionv) {
		Deductionv = deductionv;
	}



	public int getQosv() {
		return Qosv;
	}



	public void setQosv(int qosv) {
		Qosv = qosv;
	}



	public float getTipRatev() {
		return TipRatev;
	}



	public void setTipRatev(float tipRatev) {
		TipRatev = tipRatev;
	}



	public float getPerPersonTipv() {
		return perPersonTipv;
	}



	public void setPerPersonTipv(float perPersonTipv) {
		this.perPersonTipv = perPersonTipv;
	}



	public float getTotalBillandTipv() {
		return totalBillandTipv;
	}



	public void setTotalBillandTipv(float totalBillandTipv) {
		this.totalBillandTipv = totalBillandTipv;
	}



	public float getTotalTipv() {
		return totalTipv;
	}



	public void setTotalTipv(float totalTipv) {
		this.totalTipv = totalTipv;
	}



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



	public JLabel getTotalTip() {
		return TotalTip;
	}



	public void setTotalTip(JLabel totalTip) {
		TotalTip = totalTip;
	}



	public JLabel getPerPersonTip() {
		return perPersonTip;
	}



	public void setPerPersonTip(JLabel perPersonTip) {
		this.perPersonTip = perPersonTip;
	}



	public JLabel getTotalBillandTip() {
		return totalBillandTip;
	}



	public void setTotalBillandTip(JLabel totalBillandTip) {
		this.totalBillandTip = totalBillandTip;
	}



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
	

	int minP=0;
	public int getMaxP() {
		return maxP;
	}



	public void setMaxP(int maxP) {
		this.maxP = maxP;
	}


	int maxP=0;

	public int getMinP() {
		return minP;
	}



	public void setMinP(int minP) {
		this.minP = minP;
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




	public void homeV()
	 {
		
		setDeductStatus(getDeductStatus());
		setTaxStatus(getTaxStatus());
		
		homeView vh = new homeView();
		
		vh.Deduction.setText(Integer.toString(getDeductionv()));
		vh.NoOfGuest.setText(Integer.toString(getNoOfGuestv()));
		vh.Tax.setText(Integer.toString(getTaxv()));
		vh.TotalBill.setText(Integer.toString(getTotalBillv()));
		vh.TipRate.setText(Float.toString(getTipRatev()));
		
		
		vh.TotalTip.setText(Float.toString( getTotalTipv()));
		
	//	System.out.println(getTotalBillandTipv());
		vh.totalBillandTip.setText(Float.toString(getTotalBillandTipv()));
		vh.Qos.setValue(getQosv());

		
		setDeduction(vh.getDeduction());
		setNoOfGuest(vh.getNoOfGuest());
		setQos(vh.getQos());
		setTax(vh.getTax());
		setTotalBill(vh.getTotalBill());
		setPerPersonTip(vh.getPerPersonTip());
		setTotalTip(vh.getTotalTip());
		setTipRate(vh.getTipRate());
		setTotalBillandTip(vh.getTotalBillandTip());
		setAdjstGo(vh.getAdjstGo());
		setGuestGo(vh.getGuestGo());
		
		
		
		
		
		
		homeModel mh = new homeModel();
		
		
		mh.setDeduction(getDeductionv());
		mh.setNoOfGuest(getNoOfGuestv());
		mh.setPerPersonTip(getPerPersonTipv());
		mh.setQos(getQosv());
		mh.setTax(getTaxv());
		mh.setTotalBill(getTotalBillv());

		mh.setTotalTip(getTotalTipv());
		mh.setTotalBillandTip(getTotalBillandTipv());
		
		
		mh.setDeductStatus(getDeductStatus());
		mh.setTaxStatus(getTaxStatus());
		
	
		
		
		int tip=mh.calculateTotalTip();	
	/*	if(getTotalTipv()!=tip)
		{
			TotalTip.setText(Float.toString(getTotalTipv()));
			
		}	
		
		else
		{
			

			  TotalTip.setText(Integer.toString(tip));
		}
	*/	
		float rate=	mh.calculateTipRate();
		  float pertip=	mh.calculateperPersonTip();
		  int total=mh.calculateTotalBillandTip();
		  
		  TipRate.setText(Float.toString(rate));
		  perPersonTip.setText(Float.toString(pertip));
		  
		  totalBillandTip.setText(Integer.toString(total));

		
		
		
//	----------	//
		NoOfGuest.getDocument().addDocumentListener(new DocumentListener(){ 
	    	  
	    	  @Override
	    	  public void changedUpdate(DocumentEvent e)
	    	  {
	    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
	    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
	    		  mh.setTax(Integer.parseInt(getTax().getText()));
	    		  mh.setQos(getQos().getValue());
	    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
			    	
	    		//int tip=mh.calculateTotalTip();	
	    		
	    		float rate=	mh.calculateTipRate();
	    		  float pertip=	mh.calculateperPersonTip();
	    		  int total=mh.calculateTotalBillandTip();
	    		  
	    		  TipRate.setText(Float.toString(rate));
	    		  perPersonTip.setText(Float.toString(pertip));
	    		//  TotalTip.setText(Integer.toString(tip));
	    		  totalBillandTip.setText(Integer.toString(total));
	    		  
	    	  }
	    	  
	    	  public void insertUpdate(DocumentEvent e)
	    	  {
	    		  
	    			
	    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
	    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
	    		  mh.setTax(Integer.parseInt(getTax().getText()));
	    		  mh.setQos(getQos().getValue());
	    		//  System.out.println(getQos().getValue());
	    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
			    		    		  
	    	//	int tip=mh.calculateTotalTip();	
	    		float rate=	mh.calculateTipRate();
	    		  float pertip=	mh.calculateperPersonTip();
	    		  int total=mh.calculateTotalBillandTip();
	    		  
	    		  TipRate.setText(Float.toString(rate));
	    		  perPersonTip.setText(Float.toString(pertip));
	    		//  TotalTip.setText(Integer.toString(tip));
	    		  totalBillandTip.setText(Integer.toString(total));
	    		 
	    	  }
	    	  public void removeUpdate(DocumentEvent e)
	    	  {
	    		  try{
	    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
	    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
	    		  mh.setTax(Integer.parseInt(getTax().getText()));
	    		  mh.setQos(getQos().getValue());
	    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
	    		  }
	    		  catch(NumberFormatException ex)
	    		  {
	    			  mh.setNoOfGuest(0);
	    		  }
	    		//int tip=mh.calculateTotalTip();	
	    		float rate=	mh.calculateTipRate();
	    		  float pertip=	mh.calculateperPersonTip();
	    		  int total=mh.calculateTotalBillandTip();
	    		  
	    		  TipRate.setText(Float.toString(rate));
	    		  perPersonTip.setText(Float.toString(pertip));
	    		  //TotalTip.setText(Integer.toString(tip));
	    		  totalBillandTip.setText(Integer.toString(total));
	    		 	    	  }
	    
	   });

		
//		----------	//
			Tax.getDocument().addDocumentListener(new DocumentListener(){ 
		    	  
		    	  @Override
		    	  public void changedUpdate(DocumentEvent e)
		    	  {
		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
				    	
		    		  
		    		//int tip=	mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    		  //TotalTip.setText(Integer.toString(tip));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		  
		    	  }
		    	  
		    	  public void insertUpdate(DocumentEvent e)
		    	  {
		    		 try{
		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
		    		 }
		    		 catch(NumberFormatException ex)
		    		 {
		    			 mh.setDeduction(0);
		    		 }
		    		  
		    		  //int tip=mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    		  // TotalTip.setText(Integer.toString(tip));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		 
		    	  }
		    	  public void removeUpdate(DocumentEvent e)
		    	  {
		    		  try{
		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
		    		  }
		    		  catch(NumberFormatException ex){
		    			  
		    			  mh.setNoOfGuest(0);
		    			  mh.setDeduction(0);
		    		  }
		    		  
		    		  //int tip=mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    		  //TotalTip.setText(Integer.toString(tip));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		 	    	  }
		    
		    
		   });

		
//			----------	//
			Deduction.getDocument().addDocumentListener(new DocumentListener(){ 
		    	  
		    	  @Override
		    	  public void changedUpdate(DocumentEvent e)
		    	  {
		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
				    	
		    		  
		    		  //int tip=	mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    		  //TotalTip.setText(Integer.toString(tip));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		  
		    	  }
		    	  
		    	  public void insertUpdate(DocumentEvent e)
		    	  {
		    		  try{

		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
		    	  }
		    		catch(NumberFormatException ex)
	    		  	{
	    		  		
	    		  		mh.setNoOfGuest(0);
	    		  	}	
		    		  
		    		  //int tip=mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    		  //TotalTip.setText(Integer.toString(tip));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		 
		    	  }
		    	  public void removeUpdate(DocumentEvent e)
		    	  {
		    		  
		    		  try{
		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
		    		  }
		    		  catch(NumberFormatException ex){
		    			  
		    			  mh.setDeduction(0);
		    		  }
		    		  
		    		  //int tip=mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    		  //TotalTip.setText(Integer.toString(tip));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		 	    	  }
		    
		   });

			
//			----------	//
			TotalBill.getDocument().addDocumentListener(new DocumentListener(){ 
		    	  
		    	  @Override
		    	  public void changedUpdate(DocumentEvent e)
		    	  {
		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
		    		  //mh.setTotalTip(getTotalTipv());
				    	
		    		  
		    	//	int tip=	mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    		//  TotalTip.setText(Integer.toString(tip));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		  
		    	  }
		    	  
		    	  public void insertUpdate(DocumentEvent e)
		    	  {
		    		  	try{
		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
		    		  	}
		    		  	catch(NumberFormatException ex)
		    		  	{
		    		  		
		    		  		mh.setNoOfGuest(0);
		    		  	}		    		  
		    	//	int tip=mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    	//	 TotalTip.setText(Integer.toString(getQos().getValue()));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		 
		    	  }
		    	  public void removeUpdate(DocumentEvent e)
		    	  {
		    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
		    		  try{
		    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
		    		  mh.setTax(Integer.parseInt(getTax().getText()));
		    		  mh.setQos(getQos().getValue());
		    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
		    		  }
		    		  catch(NumberFormatException ex){
		    			  
		    			  mh.setNoOfGuest(0);
		    		  }
		    		  
		    		//int tip=mh.calculateTotalTip();	
		    		float rate=	mh.calculateTipRate();
		    		  float pertip=	mh.calculateperPersonTip();
		    		  int total=mh.calculateTotalBillandTip();
		    		  
		    		  TipRate.setText(Float.toString(rate));
		    		  perPersonTip.setText(Float.toString(pertip));
		    		//  TotalTip.setText(Integer.toString(tip));
		    		  totalBillandTip.setText(Integer.toString(total));
		    		 	    	  }
		    
		   });

			
			
//			--slider--------	//
				Qos.addChangeListener(new ChangeListener() { 
			    	  
			    	  @Override
			    	  public void stateChanged(ChangeEvent e)
			    	  {
			    		  mh.setDeduction(Integer.parseInt(getDeduction().getText()));
			    		  mh.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
			    		  mh.setTax(Integer.parseInt(getTax().getText()));
			    		  mh.setQos(getQos().getValue());
			    		  mh.setTotalTip(getQos().getValue());
			    		  mh.setTotalBill(Integer.parseInt(getTotalBill().getText()));
					    	
			    		  
			    	//	int tip=	mh.calculateTotalTip();	
			    		float rate=	mh.calculateTipRate();
			    		  float pertip=	mh.calculateperPersonTip();
			    		  int total=mh.calculateTotalBillandTip();
			    		  
			    		  TipRate.setText(Float.toString(rate));
			    		  perPersonTip.setText(Float.toString(pertip));
			    		  TotalTip.setText(Integer.toString(getQos().getValue()));
			    		  totalBillandTip.setText(Integer.toString(total));
			    		  
			    	  }

			
				});
			
			
		
///---------adjust button--------------------////
	

			
			  adjstGo.addActionListener(new ActionListener() {
			       public void actionPerformed(ActionEvent e) { 
			      	
			      	 
			    	 //  	setI(Integer.parseInt(tf1.getText()));
			    	   
			    //
											adjustmentModel mv = new adjustmentModel();
			    							//mv.setVal(getI());
											
											
											mv.setMinPercent(getMinP());
											mv.setMaxPercent(getMaxP());
											
											mv.setDeductStaus(getDeductStatus());
											mv.setTaxStatus(getTaxStatus());
											
											try{
											mv.setDeduction(Integer.parseInt(getDeduction().getText()));
								    		  mv.setNoOfGuest(Integer.parseInt(getNoOfGuest().getText()));
								    		  mv.setTax(Integer.parseInt(getTax().getText()));
								    		  mv.setQos(getQos().getValue());
								    		  mv.setTotalBill(Integer.parseInt(getTotalBill().getText()));
											}
											catch(NumberFormatException ex)
							    		  	{
							    		  		
							    		  		mh.setDeduction(0);
							    		  	}	
								    		  mv.setTotalTip(Float.parseFloat(getTotalTip().getText()));
								    		  
											mv.setGuestlist(getGuestlist());
											
											
			    	 						mv.adjustControl();
				       
			   		
			   		
			     	 vh.mainFrame.dispose();
			       }  
			       });

		///---------------button guest-----------------------////
			  
			  guestGo.addActionListener(new ActionListener() {
			       public void actionPerformed(ActionEvent e) { 
			      	
			      	 
			    	 //  	setI(Integer.parseInt(tf1.getText()));
			    	   
			    //
											guestModel gm = new guestModel();
			    							//mv.setVal(getI());
											
											
											gm.setMinPercent(getMinP());
											gm.setMaxPercent(getMaxP());
											gm.setTaxStatus(getTaxStatus());
											gm.setDeductStatus(getDeductStatus());
											
											
											gm.setDeduct(Integer.parseInt(getDeduction().getText()));
								    		  gm.setGuest(Integer.parseInt(getNoOfGuest().getText()));
								    		  gm.setTax(Integer.parseInt(getTax().getText()));
								    		  gm.setQos(getQos().getValue());
								    		  gm.setTotalBill(Integer.parseInt(getTotalBill().getText()));
								    		  gm.setPerPersonTip(Float.parseFloat(getPerPersonTip().getText()));	


											gm.setGuestlist(getGuestlist());
											gm.setPerTipList(getPerTipList());
											gm.setSlideList(getSlideList());
											
			    	 						gm.guestControl();
				       
			   		
			   		
			     	 vh.mainFrame.dispose();
			       }  
			       });
			  
		
		
		
		
	 }
}

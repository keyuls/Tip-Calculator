import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class guestController {

	
	JButton homeGo = new JButton("");

	public JButton getHomeGo() {
		return homeGo;
	}

	public void setHomeGo(JButton homeGo) {
		this.homeGo = homeGo;
	}

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
	int minPercent=0;
	int maxPercent=0;
	float perPersonTip=0;
	
	
	
	public float getPerPersonTip() {
		return perPersonTip;
	}

	public void setPerPersonTip(float perPersonTip) {
		this.perPersonTip = perPersonTip;
	}

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

	
	int taxStaus=0;
	int deductStatus=0;

public int getTaxStaus() {
		return taxStaus;
	}

	public void setTaxStaus(int taxStaus) {
		this.taxStaus = taxStaus;
	}

	public int getDeductStatus() {
		return deductStatus;
	}

	public void setDeductStatus(int deductStatus) {
		this.deductStatus = deductStatus;
	}

JTextField[] fields = new JTextField[100];
	public JTextField[] getFields() {
	return fields;
}

public void setFields(JTextField[] fields) {
	this.fields = fields;
}

JLabel[] perPeart = new JLabel[100];

public JLabel[] getPerPeart() {
	return perPeart;
}
public void setPerPeart(JLabel[] perPeart) {
	this.perPeart = perPeart;
}

JSlider[] field = new JSlider[100];



public JSlider[] getField() {
	return field;
}
public void setField(JSlider[] field) {
	this.field = field;
}






String[] guestlist = new String[100];
String[] perTipList = new String[100];
float[] slideList = new float[100];


public float[] getSlideList() {
	return slideList;
}

public void setSlideList(float[] slideList) {
	this.slideList = slideList;
}

public String[] getPerTipList() {
	return perTipList;
}

public void setPerTipList(String[] perTipList) {
	this.perTipList = perTipList;
}

public String[] getGuestlist() {
	return guestlist;
}

public void setGuestlist(String[] guestlist) {
	this.guestlist = guestlist;
}

 		      


//-------------------------//

 
int min=0;
int max=0;

//-----------------------//
	public void guestV()
	{
		
		 min = (((getTotalBill()+getTax()-getDeduct())*getMinPercent()))/100 ;
		 max = (((getTotalBill()+getTax()-getDeduct())*getMaxPercent()))/100 ;	
		
			
		guestView vg = new guestView(getGuest(),getPerPersonTip(),max);

		
		
		for(int i=0; i<getGuest();i++)
		{
			String s= guestlist[i];
		vg.fields[i].setText(s);
		String t = perTipList[i];
		
		float v = slideList[i];
	
		//System.out.println((int)getPerPersonTip());
		
		if(v==0)
		{		
			vg.field[i].setValue((int)getPerPersonTip());
			vg.perPeart[i].setText(Float.toString(getPerPersonTip()));
		}
		else
		{
						vg.field[i].setValue((int)v);
						vg.perPeart[i].setText(t);
		}
		
		}

	setFields(vg.getFields());
	setPerPeart(vg.getPerPeart());
	setField(vg.getField()); 
	
	
		setHomeGo(vg.getHomeGo());
		
		
		
		homeGo.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) { 
		     	
		    	  for (int i = 0; i < getGuest(); ++i)
					{
							
						guestlist[i]=fields[i].getText();
						perTipList[i]= perPeart[i].getText();
						slideList[i]= field[i].getValue();
							
					}	

					 calculateNew();
		
					 
					 
					 if(totalTip<minPercent || totalTip>max)
					   {
						  // System.out.println("out of range");

							  JOptionPane.showMessageDialog(null,
				 			          "Error: 	Tip is out of range ", "Error Massage",
				 			          JOptionPane.ERROR_MESSAGE);	
							  
							 
							  
					   } 

					 
					 
					 
		    	  
		 	homeModel ma = new homeModel();
		 	ma.setDeduction(getDeduct());
		 	ma.setTax(getTax());
		 	ma.setQos((int)totalTip);
		 	ma.setNoOfGuest(getGuest());
		 	ma.setTotalBill(getTotalBill());
//System.out.println(totalTip);
		 	ma.setTotalTip(totalTip);
		 	ma.setTotalBillandTip(newBill);
		 	
		 	
		 	ma.setMinP(getMinPercent());		
			ma.setMaxP(getMaxPercent());	
			ma.setTaxStatus(getTaxStaus());
			ma.setDeductStatus(getDeductStatus());
			
			
			
				ma.setGuestlist(getGuestlist());
				ma.setPerTipList(getPerTipList());
				ma.setSlideList(getSlideList());
			
		  		ma.homeControl();
		  		
			vg.mainFrame.dispose();
		      }  
		      });

	}		
	//-------------------------//

	float totalTip=0;
	float newBill=0;
protected void calculateNew() {

	
	   
	   for(int o=0;o<getGuest() ;o++)
	   { 
		   
	   totalTip = totalTip + slideList[o];
	   newBill = getTotalBill()+getTax()-getDeduct() + totalTip ;
	   
	  // setTotalBill((int)newBill);
	   }
	   
	   	   
	 
	   
}
}


	
	


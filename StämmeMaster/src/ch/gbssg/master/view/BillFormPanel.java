package ch.gbssg.master.view;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class BillFormPanel extends JPanel{
 	private static final long serialVersionUID = 1L;
	JTextField	txtOperationTime;
	JTextField	txtPrice;
	ObservingTextField txtDate;
	JButton     btnBrowse;
	
	public BillFormPanel(){
		setLayout(new GridLayout(3,3,10,30));
		JLabel lblOperationTime;
		JLabel lblPrice;
		JLabel lblDate;
		txtOperationTime		= new JTextField();
		txtPrice    			= new JTextField();
		txtDate                 = new ObservingTextField();
		btnBrowse               = new JButton("...");

		// create labels with border that contains 10px space from the left
		lblOperationTime = new JLabel("Behandlungsdauer (h):");
		lblOperationTime.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblPrice = new JLabel("Stundensatz (CHF):");
		lblPrice.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblDate = new JLabel("Behandlungsdatum:");
		lblDate.setBorder(new EmptyBorder(0, 10, 0, 0));
		add(lblOperationTime);
		add(txtOperationTime);
		add(new JLabel());
		add(lblPrice);
		add(txtPrice);
		add(new JLabel());
		add(lblDate);
		add(txtDate);
		add(btnBrowse);
	}
	
	public double getOperationTime(){
		double operationTime;
		try{  
			operationTime = Double.parseDouble(txtOperationTime.getText());  
		}catch(NumberFormatException nfe){  
		  return(-1);  
		}  
		return(operationTime);
	}
	public double getPrice(){
		double price;
		try{  
			price = Double.parseDouble(txtPrice.getText());  
		}catch(NumberFormatException nfe){  
		  return(-1);  
		}  
		return(price);
	}
	public ObservingTextField getDatePickerTxtField(){
		return(txtDate);
	}
	public void setBtnBrowseActionListener(ActionListener a){
		this.btnBrowse.addActionListener(a);
	}
}

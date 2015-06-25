package ch.gbssg.master.view;

/**
 * This class create the GUI to generate a bill patient.
 * It contains functions to communicate with his elements.
 * @author Livio Rinaldi
 * @class  IAN6A
 */

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GenerateBillView extends JFrame{
	private static final long serialVersionUID = 1L;
	private BillFormPanel pnlBillForm;
	private BillButtonTextAreaPanel pnlBillButtonTextArea;
	
	public GenerateBillView(){
		super("Rechnung generieren");
		initForm();
	}
	
	/**
     * initialize the JForm and postition all GUI elements
     */
    private void initForm(){
    	this.setLayout(new GridLayout(2,1));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(480, 500);
        this.setMinimumSize(new Dimension(480,200));
        

        pnlBillForm = new BillFormPanel();
        pnlBillButtonTextArea = new BillButtonTextAreaPanel();
        this.add(pnlBillForm);
        this.add(pnlBillButtonTextArea);
        
		// calculate the middle of the screen and set the frame there
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    /**
     * shows an error Message with the String u give as parameter
     * @param errorMessage
     */
    public void showError(String errorMessage){
    	String titleBar = "Fehler";
    	JOptionPane.showMessageDialog(null, errorMessage, titleBar, JOptionPane.ERROR_MESSAGE);
    }

    /**
     * shows an info Message with the String u give as parameter
     * @param infoMessage
     */
    public void showMessage(String infoMessage){
    	String titleBar = "Information";
    	JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    public void setBtnBrowseActionListener(ActionListener a){
    	pnlBillForm.setBtnBrowseActionListener(a);
    }
    public void setBtnSaveActionListener(ActionListener a){
    	pnlBillButtonTextArea.setBtnSaveActionListener(a);
    }
    public void setBtnPrintActionListener(ActionListener a){
    	pnlBillButtonTextArea.setBtnPrintActionListener(a);
    }
    public void setBtnCloseActionListener(ActionListener a){
    	pnlBillButtonTextArea.setBtnCloseActionListener(a);
    }

    public double getOperationTime(){
    	return(pnlBillForm.getOperationTime());
    }
    public double getPrice(){
    	return(pnlBillForm.getPrice());
    }
    public ObservingTextField getDatePickerTxtField(){
    	return pnlBillForm.getDatePickerTxtField();
    }
    public String getDescription(){
    	return(pnlBillButtonTextArea.getDescription());
    }
}

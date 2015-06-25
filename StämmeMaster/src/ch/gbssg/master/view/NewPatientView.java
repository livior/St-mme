package ch.gbssg.master.view;

/**
 * This class create the GUI to create a new patient.
 * It contains functions to communicate with his elements.
 * @author Livio Rinaldi
 * @class  IAN6A
 */

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.*;


public class NewPatientView extends JFrame{
	private static final long serialVersionUID = 1L;
	private FormPanel pnlForm;
	ButtonTextAreaPanel pnlButtonTextArea;
	
	public NewPatientView(){
		super("Patient hinzufügen");
		initForm();
	}
	
	/**
     * initialize the JForm and postition all GUI elements
     */
    private void initForm(){
    	this.setLayout(new GridLayout(2,1));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(400, 500);
        

        pnlForm = new FormPanel();
        pnlButtonTextArea = new ButtonTextAreaPanel();
        this.add(pnlForm);
        this.add(pnlButtonTextArea);
        
		// calculate the middle of the screen and set the frame there
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
   
    /**
     * shows an error Message with the String u give as parameter
     * @param infoMessage
     */
    public void showError(String infoMessage){
    	String titleBar = "Fehler";
    	JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.ERROR_MESSAGE);
    }
    public void setBtnBrowseActionListener(ActionListener a){
    	pnlForm.setBtnBrowseActionListener(a);
    }
    public void setBtnSaveActionListener(ActionListener a){
    	pnlButtonTextArea.setBtnSaveActionListener(a);
    }
    public void setBtnCloseActionListener(ActionListener a){
    	pnlButtonTextArea.setBtnCloseActionListener(a);
    }

    public String getSurname(){
    	return(pnlForm.getSurname());
    }
    public String getFirstName(){
    	return(pnlForm.getFirstName());
    }
    public ObservingTextField getDatePickerTxtField(){
    	return pnlForm.getDatePickerTxtField();
    }
    public String getBirthdate(){
    	return pnlForm.getDatePickerTxtField().getText();
    }

    public String getAddress(){
    	return(pnlForm.getAddress());
    }
    public int getPostalCode(){
    	return(pnlForm.getPostalCode());
    }
    public String getPlace(){
    	return(pnlForm.getPlace());
    }
    public String getMedicalHistory(){
    	return(pnlButtonTextArea.getMedicalHistory());
    }
}

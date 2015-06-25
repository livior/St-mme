package ch.gbssg.master.view;

/**
 * This class create the GUI to edit a patient.
 * It contains functions to communicate with his elements.
 * @author Livio Rinaldi
 * @class  IAN6A
 */

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.*;

import ch.gbssg.master.model.TownModel;


public class EditPatientView extends JFrame{
	private static final long serialVersionUID = 1L;
	private FormPanel pnlForm;
	private ButtonTextAreaPanel pnlButtonTextArea;
	
	public EditPatientView(TownModel patient){
		super("Patient bearbeiten");
		initForm(patient);
	}
	
	/**
     * initialize the JForm and postition all GUI elements
     * @param patient
     */
    private void initForm(TownModel patient){
    	this.setLayout(new GridLayout(2,1));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(400, 500);
        

        pnlForm = new FormPanel();
        pnlButtonTextArea = new ButtonTextAreaPanel();
        pnlForm.setFormData(patient);
        pnlButtonTextArea.setTextAreaData(patient.getMedicalHistory());
        this.add(pnlForm);
        this.add(pnlButtonTextArea);
        
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
    	JOptionPane.showMessageDialog(null, errorMessage, "InfoBox: " + titleBar, JOptionPane.ERROR_MESSAGE);
    }
    public void setBtnBrowseEditActionListener(ActionListener a){
    	pnlForm.setBtnBrowseActionListener(a);
    }
    public void setBtnSaveEditActionListener(ActionListener a){
    	pnlButtonTextArea.setBtnSaveActionListener(a);
    }
    public void setBtnCloseEditActionListener(ActionListener a){
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

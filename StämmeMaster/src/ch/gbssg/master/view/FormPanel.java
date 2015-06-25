package ch.gbssg.master.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ch.gbssg.master.model.TownModel;


public class FormPanel extends JPanel{
 	private static final long serialVersionUID = 1L;
	JTextField	txtSurname;
	JTextField	txtFirstName;
	ObservingTextField txtDate;
	JButton     btnBrowse;
	JTextField	txtAddress;
	JTextField	txtPostalCode;
	JTextField	txtPlace;
	
	public FormPanel(){
		JLabel lblFirstName; 
		JLabel lblSurname;
		JLabel lblBirthdate;
		JLabel lblAddress;
		JLabel lblPostalCodePlace;
		
		setLayout(new GridLayout(5,3,10,10));
		txtSurname				= new JTextField();
		txtFirstName			= new JTextField();
		txtDate                 = new ObservingTextField();
		btnBrowse               = new JButton("...");
		txtAddress				= new JTextField();
		txtPostalCode			= new JTextField();
		txtPlace				= new JTextField();

		// create labels with border that contains 10px space from the left
		lblFirstName = new JLabel("Name:");
		lblFirstName.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblSurname = new JLabel("Vorname:");
		lblSurname.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblBirthdate = new JLabel("Geburtsdatum:");
		lblBirthdate.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblAddress = new JLabel("Adresse:");
		lblAddress.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblPostalCodePlace = new JLabel("PLZ/Ort:");
		lblPostalCodePlace.setBorder(new EmptyBorder(0, 10, 0, 0));
		
		add(lblFirstName);
		add(txtFirstName);
		add(new JLabel());
		add(lblSurname);
		add(txtSurname);
		add(new JLabel());
		add(lblBirthdate);
		add(txtDate);
		add(btnBrowse);
		add(lblAddress);
		add(txtAddress);
		add(new JLabel());
		add(lblPostalCodePlace);
		add(txtPostalCode);
		add(txtPlace);
	}
	
	public void setFormData(TownModel patient){
		txtSurname.setText(patient.getSurname());
		txtFirstName.setText(patient.getFirstName());
		txtDate.setText(patient.getBirthdate());
		txtAddress.setText(patient.getAddress());
		txtPostalCode.setText("" + patient.getPostalCode());
		txtPlace.setText(patient.getPlace());
	}
	public String getSurname(){
		return(txtSurname.getText());
	}
	public String getFirstName(){
		return(txtFirstName.getText());
	}
	public ObservingTextField getDatePickerTxtField(){
		return(txtDate);
	}
	public String getAddress(){
		return(txtAddress.getText());
	}
	public int getPostalCode(){
		int postalCode;
		try{  
			postalCode = Integer.parseInt(txtPostalCode.getText());  
		}catch(NumberFormatException nfe){  
		  return(-1);  
		}  
		return(postalCode);
	}
	public String getPlace(){
		return(txtPlace.getText());
	}
	public void setBtnBrowseActionListener(ActionListener a){
		this.btnBrowse.addActionListener(a);
	}
}

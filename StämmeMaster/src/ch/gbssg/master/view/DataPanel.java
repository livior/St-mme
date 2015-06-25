package ch.gbssg.master.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import ch.gbssg.master.model.TownModel;

public class DataPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	JLabel lblValueID;
	JLabel lblValueSurname;
	JLabel lblValueFirstName;
	JLabel lblValueBirthdate;
	JLabel lblValueAddress;
	JLabel lblValuePostalCodePlace;
	JTextArea  txtAreaMedicalHistory;
	JScrollPane scrollPane;
	
	public DataPanel(){
		JPanel pnlFormData;
		JPanel pnlMedicalHistory;
		JLabel lblID; 
		JLabel lblFirstName; 
		JLabel lblSurname;
		JLabel lblBirthdate;
		JLabel lblAddress;
		JLabel lblPostalCodePlace;
		setLayout(new GridLayout(2,1));
		
		pnlFormData			= new JPanel(new GridLayout(8,2));
		pnlMedicalHistory	= new JPanel(new BorderLayout());
		
		
		Font oldLabelFont = UIManager.getFont("Label.font");

		// make it bold
	    UIManager.put("Label.font", oldLabelFont.deriveFont(Font.BOLD));

		// create labels with border that contains 10px space from the left
	    lblID = new JLabel("Patienten Nr.:");
		lblID.setBorder(new EmptyBorder(0, 10, 0, 0));
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

		// make it not bold
	    UIManager.put("Label.font", oldLabelFont.deriveFont(Font.PLAIN));
	    
	    // create labels that contains the values
		lblValueID					= new JLabel("");
		lblValueSurname				= new JLabel("");
		lblValueFirstName			= new JLabel("");
		lblValueBirthdate			= new JLabel("");
		lblValueAddress				= new JLabel("");
		lblValuePostalCodePlace		= new JLabel("");
		
		// make it bold
	    UIManager.put("Label.font", oldLabelFont.deriveFont(Font.BOLD));

	    txtAreaMedicalHistory	= new JTextArea("");
		txtAreaMedicalHistory.setEditable(false);
		scrollPane              = new JScrollPane(txtAreaMedicalHistory);
		
	    
		// add components
		pnlFormData.add(lblID);
		pnlFormData.add(lblValueID);
		pnlFormData.add(lblSurname);
		pnlFormData.add(lblValueSurname);
		pnlFormData.add(lblFirstName);
		pnlFormData.add(lblValueFirstName);
		pnlFormData.add(lblBirthdate);
		pnlFormData.add(lblValueBirthdate);
		pnlFormData.add(lblAddress);
		pnlFormData.add(lblValueAddress);
		pnlFormData.add(lblPostalCodePlace);
		pnlFormData.add(lblValuePostalCodePlace);
		pnlFormData.add(new JLabel());
		pnlFormData.add(new JLabel());
		
		pnlMedicalHistory.add(new JLabel("Krankengeschichte:"), BorderLayout.NORTH);
		pnlMedicalHistory.add(scrollPane, BorderLayout.CENTER);
		
		add(pnlFormData);
		add(pnlMedicalHistory);
	}
	
	public void clearDataPanel(){
		lblValueID.setText("");
		lblValueSurname.setText("");
		lblValueFirstName.setText("");
		lblValueBirthdate.setText("");
		lblValueAddress.setText("");
		lblValuePostalCodePlace.setText("");
		txtAreaMedicalHistory.setText("");
	}
	public void setPatient(TownModel patient){
		lblValueID.setText("" + patient.getID());
		lblValueSurname.setText(patient.getSurname());
		lblValueFirstName.setText(patient.getFirstName());
		lblValueBirthdate.setText(patient.getBirthdate());
		lblValueAddress.setText(patient.getAddress());
		lblValuePostalCodePlace.setText("" + patient.getPostalCode() + " " + patient.getPlace());
		txtAreaMedicalHistory.setText(patient.getMedicalHistory());
	}
}

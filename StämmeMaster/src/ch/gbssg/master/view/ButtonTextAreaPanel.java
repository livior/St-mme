package ch.gbssg.master.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonTextAreaPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	JScrollPane scrollPane;
	JTextArea txtAreaMedicalHistory;
	JButton btnSave;
	JButton btnClose;
	
	public ButtonTextAreaPanel(){
		JPanel pnlButtons;
		JPanel pnlButtonLeft;
		JPanel pnlButtonRight;
		
		pnlButtons = new JPanel(new GridLayout(1,2));
		pnlButtonLeft = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		pnlButtonRight  = new JPanel(new FlowLayout(FlowLayout.RIGHT,5,5));

		pnlButtons.add(pnlButtonLeft);
		pnlButtons.add(pnlButtonRight);

		setLayout(new BorderLayout());
		
		txtAreaMedicalHistory = new JTextArea();
		scrollPane      = new JScrollPane(txtAreaMedicalHistory);

		btnSave = new JButton("Speichern");
		btnClose = new JButton("Schliessen");
		add(new JLabel("Krankengeschichte:"), BorderLayout.NORTH);
		pnlButtonLeft.add(btnSave);
		pnlButtonRight.add(btnClose);
		add(scrollPane, BorderLayout.CENTER);
		add(pnlButtons, BorderLayout.SOUTH);
	}
	
	public String getMedicalHistory(){
		return(txtAreaMedicalHistory.getText());
	}
	public void setBtnSaveActionListener(ActionListener a){
		this.btnSave.addActionListener(a);
	}
	public void setBtnCloseActionListener(ActionListener a){
		this.btnClose.addActionListener(a);
	}
	public void setTextAreaData(String text){
		this.txtAreaMedicalHistory.setText(text);
	}
}

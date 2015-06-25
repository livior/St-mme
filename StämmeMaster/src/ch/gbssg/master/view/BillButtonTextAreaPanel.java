package ch.gbssg.master.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BillButtonTextAreaPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	JScrollPane scrollPane;
	JTextArea txtAreaDescription;
	JButton btnSave;
	JButton btnPrint;
	JButton btnClose;
	
	public BillButtonTextAreaPanel(){
		JPanel pnlButtons;
		JPanel pnlButtonLeft;
		JPanel pnlButtonRight;
		
		pnlButtons = new JPanel(new GridLayout(1,2));
		pnlButtonLeft = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		pnlButtonRight  = new JPanel(new FlowLayout(FlowLayout.RIGHT,5,5));

		pnlButtons.add(pnlButtonLeft);
		pnlButtons.add(pnlButtonRight);

		setLayout(new BorderLayout());
		
		txtAreaDescription = new JTextArea();
		scrollPane      = new JScrollPane(txtAreaDescription);

		btnSave = new JButton("Speichern...");
		btnPrint = new JButton("Drucken...");
		btnClose = new JButton("Schliessen");
		add(new JLabel("Beschreibung:"), BorderLayout.NORTH);
		pnlButtonLeft.add(btnSave);
		pnlButtonLeft.add(btnPrint);
		pnlButtonRight.add(btnClose);
		add(scrollPane, BorderLayout.CENTER);
		add(pnlButtons, BorderLayout.SOUTH);
	}
	
	public String getDescription(){
		return(txtAreaDescription.getText());
	}
	public void setBtnSaveActionListener(ActionListener a){
		this.btnSave.addActionListener(a);
	}
	public void setBtnPrintActionListener(ActionListener a){
		this.btnPrint.addActionListener(a);
	}
	public void setBtnCloseActionListener(ActionListener a){
		this.btnClose.addActionListener(a);
	}
}

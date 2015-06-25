package ch.gbssg.master.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Creates several buttons in a Flow Layout
 * @author Livio Rinaldi
 *
 */
public class ButtonPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private JButton btnNew;
	private JButton btnDelete;
	private JButton btnGenerateBill;
	private JButton btnEdit;
	private JButton btnExport;

	public ButtonPanel(){
		JPanel flowLeft;
		JPanel flowRight;
		ImageIcon image = new ImageIcon(".\\img\\add_patient.png");
		ImageIcon image2 = new ImageIcon(".\\img\\delete_patient.png");
		
		setLayout(new GridLayout(1,2));
		flowLeft  = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		flowRight = new JPanel(new FlowLayout(FlowLayout.RIGHT,5,5));
		
		btnNew		= new JButton();
		btnDelete	= new JButton();
		btnGenerateBill = new JButton("Rechnung generieren...");
		btnEdit		= new JButton("Bearbeiten...");
		btnExport	= new JButton("Exportieren...");

		btnNew.setIcon(image);
		btnNew.setBorderPainted(false);
		btnNew.setFocusPainted(false);
		btnNew.setContentAreaFilled(false);		// to remote the spacing between the image and button's borders
		
		btnDelete.setIcon(image2);
		btnDelete.setBorderPainted(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setContentAreaFilled(false);		// to remote the spacing between the image and button's borders

		flowLeft.add(btnNew);
		flowLeft.add(btnDelete);

		flowRight.add(btnGenerateBill);
		flowRight.add(btnEdit);		
		flowRight.add(btnExport);		
		add(flowLeft);
		add(flowRight);
	}
	
	public void setBtnNewActionListener(ActionListener a){
		this.btnNew.addActionListener(a);
	}
	public void setBtnDeleteActionListener(ActionListener a){
		this.btnDelete.addActionListener(a);
	}
	public void setBtnGenerateBillActionListener(ActionListener a){
		this.btnGenerateBill.addActionListener(a);
	}
	public void setBtnExportActionListener(ActionListener a){
		this.btnExport.addActionListener(a);
	}
	public void setBtnEditActionListener(ActionListener a){
		this.btnEdit.addActionListener(a);
	}
	
	public void setBtnsActive(boolean active){
		btnDelete.setEnabled(active);
		btnEdit.setEnabled(active);
		btnGenerateBill.setEnabled(active);
		btnExport.setEnabled(active);
	}
}

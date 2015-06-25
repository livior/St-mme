package ch.gbssg.master.view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HeaderPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField searchField;
	private JButton btnSearch;
	
	public HeaderPanel(){
		ImageIcon image = new ImageIcon(".\\img\\search.png");
		JLabel label = new JLabel(image);
		btnSearch = new JButton("Filtern");
		label.setSize(100, 100);
		add(label);
	
		searchField=new JTextField("", 10);
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		add(searchField);
		add(btnSearch);
	}
	public void setBtnSearchActionListener(ActionListener a){
		btnSearch.addActionListener(a);
	}
	
	public String getSearchText(){
		return(searchField.getText());
	}
}

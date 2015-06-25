package ch.gbssg.master.view;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ch.gbssg.master.model.TownModel;

public class ListPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	List patientsListView;

	JScrollPane scrollPane;
	
	public ListPanel(){
        setLayout(new BorderLayout());
        patientsListView = new List();
    	scrollPane = new JScrollPane(patientsListView);
    	setSize(500,500);
    	patientsListView.select(0);
		add(scrollPane);
	}
	public ListPanel(ArrayList<TownModel> patients){
        setLayout(new BorderLayout());
        patientsListView = new List();
        
    	scrollPane = new JScrollPane(patientsListView);
    	setSize(500,500);
    	updateList(patients);
    	patientsListView.select(0);
		add(scrollPane);
	}
	public void setListActionListener(ActionListener a){
		this.patientsListView.addActionListener(a);
	}
	
	public List getList(){
		return(patientsListView);
	}

	public void updateList(ArrayList<TownModel> patients){
        int index;
        
        patientsListView.clear();
		for(index=0;index<patients.size();index++){
			if(patients.get(index).isFiltered_m())
				patientsListView.add(patients.get(index).getFirstName() + " " + patients.get(index).getSurname());
		}
        patientsListView.select(0);

	}
}

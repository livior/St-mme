package ch.gbssg.master.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import ch.gbssg.master.model.TownModel;

public class MainView extends JFrame{
	private static final long serialVersionUID = 1L;
	private HeaderPanel pnlHeader;
	private ListPanel pnlList;
	private ButtonPanel pnlButtons;
	private DataPanel pnlData;
	
	public MainView() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		super("Pave");
		initForm();
	}
	
	/**
     * initialize the JFrame and position all GUI elements
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
     */
    private void initForm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		// get design from operating system
    	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());		
		
		this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750, 500);
        this.setMinimumSize(new Dimension(750,350));
        
        
        pnlHeader = new HeaderPanel();
        this.add(pnlHeader, BorderLayout.NORTH);
        
        pnlList = new ListPanel();
        this.add(pnlList, BorderLayout.WEST);
        
        pnlButtons = new ButtonPanel();
        this.add(pnlButtons, BorderLayout.SOUTH);
        
        pnlData = new DataPanel();
        this.add(pnlData, BorderLayout.CENTER);
        
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

    public void clearDataPanel(){
    	this.pnlData.clearDataPanel();
    }
    public void setPatient(TownModel patient){
    	this.pnlData.setPatient(patient);
    }
	public void updateList(ArrayList<TownModel> patients){
		this.pnlList.updateList(patients);
	}

	public void setBtnSearchActionListener(ActionListener a){
		pnlHeader.setBtnSearchActionListener(a);
	}
    public void setBtnNewActionListener(ActionListener a){
    	pnlButtons.setBtnNewActionListener(a);
    }
    public void setBtnDeleteActionListener(ActionListener a){
    	pnlButtons.setBtnDeleteActionListener(a);
    }
    public void setBtnGenerateBillActionListener(ActionListener a){
    	pnlButtons.setBtnGenerateBillActionListener(a);
    }
    public void setBtnEditActionListener(ActionListener a){
    	pnlButtons.setBtnEditActionListener(a);
    }
    public void setBtnExportActionListener(ActionListener a){
    	pnlButtons.setBtnExportActionListener(a);
    }
    
    public void setListActionListener(ActionListener s){
    	pnlList.setListActionListener(s);
    }
    
    public void setBtnsActive(boolean active){
    	pnlButtons.setBtnsActive(active);
    }
    
    public List getList(){
    	return(pnlList.getList());
    }
    
    public String getSearchText(){
    	return(pnlHeader.getSearchText());
    }
}

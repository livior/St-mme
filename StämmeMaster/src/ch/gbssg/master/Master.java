package ch.gbssg.master;

/**
 * This class contains the main function. It's just necessary to create the controller
 * and call the function to show the main GUI.
 * @author Livio Rinaldi
 * @class  IAN6A
 */

import java.sql.SQLException;

import javax.swing.UnsupportedLookAndFeelException;

import ch.gbssg.master.controller.Controller;



public class Master {
	public Master(){
		
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, SQLException{
		Controller controller = new Controller();
		controller.showMainView();
	}

}

package ch.gbssg.master.model;

/**
 * This is a model class. It offers function to communicate with the SQLite database.
 * Patients can be added, deleted, updated and read.
 * @author Livio Rinaldi
 * @class  IAN6A
 */

import java.sql.*;
import java.util.ArrayList;

public class SQLiteDatabaseModel {
	private Connection connection_m;
	private Statement stmt = null;
	private final String CREATE_TABLE=	"CREATE TABLE IF NOT EXISTS PATIENTS " +
		                 				"(ID INT PRIMARY KEY     NOT NULL," +
		                 				"FIRSTNAME       TEXT    NOT NULL, " + 
		                 				"SURNAME         TEXT    NOT NULL, " + 
		                 				"BIRTHDATE       CHAR(10)," + 
		                 				"ADDRESS         TEXT    NOT NULL," +
		                 				"POSTALCODE      INT     NOT NULL," +
		                 				"PLACE           TEXT    NOT NULL," +
		                 				"MEDICALHISTORY  TEXT    NOT NULL)";
	private final String TABLE_NAME =   "PATIENTS";
	
	public SQLiteDatabaseModel(){
		try {
			Class.forName("org.sqlite.JDBC");
			this.connection_m = DriverManager.getConnection("jdbc:sqlite:Patients.db");
			stmt = this.connection_m.createStatement();
			String sql = CREATE_TABLE; 
		    stmt.executeUpdate(sql);
		    stmt.close();

		} catch (Exception e) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}
	
	public void addPatient(TownModel patient) throws SQLException{
		this.connection_m.setAutoCommit(false);
		stmt = this.connection_m.createStatement();
		String sql = "INSERT INTO PATIENTS (ID,FIRSTNAME,SURNAME,BIRTHDATE,ADDRESS,POSTALCODE,PLACE,MEDICALHISTORY) VALUES(" + patient.getID() + ",'" + patient.getFirstName() + "','" + patient.getSurname() + "','" + patient.getBirthdate() + "','" + patient.getAddress() + "','" + patient.getPostalCode() + "','" + patient.getPlace() + "','" + patient.getMedicalHistory() + "');";
		stmt.executeUpdate(sql);
		stmt.close();
		this.connection_m.commit();
	}
	
	public void editPatient(TownModel patient) throws SQLException{
		this.connection_m.setAutoCommit(false);
		stmt = this.connection_m.createStatement();
		String sql = "UPDATE " + TABLE_NAME + " SET FIRSTNAME = '" + patient.getFirstName() + "', SURNAME = '" + patient.getSurname() + "', BIRTHDATE = '" + patient.getBirthdate() +  "', ADDRESS = '" + patient.getAddress() + "', POSTALCODE = " + patient.getPostalCode() + ", PLACE = '" + patient.getPlace() + "', MEDICALHISTORY = '" + patient.getMedicalHistory() + "' WHERE ID = " + patient.getID() + ";";
		stmt.executeUpdate(sql);
		stmt.close();
		this.connection_m.commit();
	}
	
	public void deletePatient(TownModel patient) throws SQLException{
		this.connection_m.setAutoCommit(false);
		String sql = "DELETE FROM " + TABLE_NAME + " WHERE ID = " + patient.getID() + ";";
		stmt = this.connection_m.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		this.connection_m.commit();
	}
	
	public ArrayList<TownModel> getPatients() throws SQLException{
		ArrayList<TownModel> patients = new ArrayList<TownModel>();
		TownModel patient;
		
		try { 
			stmt = this.connection_m.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PATIENTS;"); 
	        while(rs.next()) {
	        	patient=new TownModel(rs.getString("FIRSTNAME"), rs.getString("SURNAME"), rs.getString("BIRTHDATE"), rs.getString("ADDRESS"), rs.getInt("POSTALCODE"), rs.getString("PLACE"), rs.getString("MEDICALHISTORY"));
	        	patient.setID(rs.getInt("ID"));
	        	patients.add(patient);
	            
	        }
	        rs.close(); 
		}catch(SQLException e){
			System.err.println("Couldn't handle DB-Query"); 
            e.printStackTrace(); 
		}
        stmt.close();
		return(patients);
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Patient;
import hms.model.PatientContact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class PatientContactController {

    static boolean addPatientContact(PatientContact patientContact) throws ClassNotFoundException, SQLException {
        String sql = "Insert into PatientContact values(?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, patientContact.getPatientID());
        statement.setObject(2, patientContact.getResidence());
        statement.setObject(3, patientContact.getMobile());
        
        int res = statement.executeUpdate();
        if(res > 0){
            
            return true;
        }
        return false;
    }

    public static PatientContact searchPatientContact(String patientId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from PatientContact where PatientId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, patientId);
        
        ResultSet rst = statement.executeQuery();
        if (rst.next()) {
            PatientContact patientContact = new PatientContact(rst.getString("PatientID"), rst.getString("Residence"), rst.getString("Mobile"));
            return patientContact;
        } else {
            return null;
        }
    }

    static boolean updatePatientContact(PatientContact patientContact) throws ClassNotFoundException, SQLException {
        String sql = "Update PatientContact set Residence = ?, Mobile = ? where PatientId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, patientContact.getResidence());
        statement.setObject(2, patientContact.getMobile());
        statement.setObject(3, patientContact.getPatientID());
        
        int res = statement.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }
    
}

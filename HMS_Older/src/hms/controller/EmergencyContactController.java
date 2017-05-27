/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.EmergencyContact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class EmergencyContactController {

    static boolean addEmergencyContact(EmergencyContact emergencyContact) throws ClassNotFoundException, SQLException {
        String sql = "Insert into EmergencyContact values(?, ?, ?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, emergencyContact.getPatientId());
        preparedStatement.setObject(2, emergencyContact.getRelationship());
        preparedStatement.setObject(3, emergencyContact.getName());
        preparedStatement.setObject(4, emergencyContact.getMobile());
        preparedStatement.setObject(5, emergencyContact.getResidence());
        
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }

    public static EmergencyContact searchPatient(String patientId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from EmergencyContact where PatientID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, patientId);
        
        ResultSet rst = statement.executeQuery();
        if (rst.next()) {
            EmergencyContact emergencyContact = new EmergencyContact(rst.getString("PatientID"), rst.getString("Relationship"), rst.getString("Name"), rst.getString("Mobile"), rst.getString("Residence"));
            return emergencyContact;
        } else {
            return null;
        }
    }

    static boolean updateEmergencyContact(EmergencyContact emergencyContac) throws ClassNotFoundException, SQLException {
        String sql = "Update EmergencyContact set Relationship = ?, Name = ?, Mobile = ?, Residence= ? where PatientId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, emergencyContac.getRelationship());
        statement.setObject(2, emergencyContac.getName());
        statement.setObject(3, emergencyContac.getMobile());
        statement.setObject(4, emergencyContac.getResidence());
        statement.setObject(5, emergencyContac.getPatientId());
        
        int res = statement.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }
    
}

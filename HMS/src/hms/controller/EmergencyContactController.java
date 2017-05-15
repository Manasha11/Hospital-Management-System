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
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.PatientContact;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
}

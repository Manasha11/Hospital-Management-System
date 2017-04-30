/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Nurse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class NurseController {

    public static boolean addNurse(Nurse nurse) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Nurse values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, nurse.getNurseId());
        preparedStatement.setObject(2, nurse.getEmployeeId());
        preparedStatement.setObject(3, nurse.getFirstName());
        preparedStatement.setObject(4, nurse.getLastName());
        preparedStatement.setObject(5, nurse.getNic());
        preparedStatement.setObject(6, nurse.getDob());
        preparedStatement.setObject(7, nurse.getGender());
        preparedStatement.setObject(8, nurse.getContatctNo());
        preparedStatement.setObject(9, nurse.getPostalCode());
        preparedStatement.setObject(10, nurse.getStreet());
        preparedStatement.setObject(11, nurse.getCity());
        preparedStatement.setObject(12, nurse.getDistrict());
        preparedStatement.setObject(13, nurse.getEmail());
        
        int res = preparedStatement.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }
    
}

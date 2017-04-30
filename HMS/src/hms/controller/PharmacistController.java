/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Pharmacist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class PharmacistController {

    public static boolean addPharmacist(Pharmacist pharmacist) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Pharmacist values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, pharmacist.getPharmacistId());
        preparedStatement.setObject(2, pharmacist.getEmployeeId());
        preparedStatement.setObject(3, pharmacist.getFirstName());
        preparedStatement.setObject(4, pharmacist.getLastName());
        preparedStatement.setObject(5, pharmacist.getNic());
        preparedStatement.setObject(6, pharmacist.getDob());
        preparedStatement.setObject(7, pharmacist.getGender());
        preparedStatement.setObject(8, pharmacist.getContatctNo());
        preparedStatement.setObject(9, pharmacist.getPostalCode());
        preparedStatement.setObject(10, pharmacist.getStreet());
        preparedStatement.setObject(11, pharmacist.getCity());
        preparedStatement.setObject(12, pharmacist.getDistrict());
        preparedStatement.setObject(13, pharmacist.getEmail());
        
        int res = preparedStatement.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }
    
}

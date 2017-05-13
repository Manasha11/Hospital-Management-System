/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Nurse;
import hms.model.Pharmacist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public static boolean updatePharmacist(Pharmacist pharmacist) throws ClassNotFoundException, SQLException {
        String sql = "Update Pharmacist set PharmacistFirstName = ?, PharmacistLastName = ?, PharmacistNIC = ?, PharmacistDOB = ?, "
                + "PharmacistGender = ?, PharmacistContactNo =?, PharmacistPostalCode = ?, PharmacistStreet = ?, "
                + "PharmacistCity = ?, PharmacistDistrict = ?, PharmacistEmail = ? where PharmacistID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, pharmacist.getFirstName());
        preparedStatement.setObject(2, pharmacist.getLastName());
        preparedStatement.setObject(3, pharmacist.getNic());
        preparedStatement.setObject(4, pharmacist.getDob());
        preparedStatement.setObject(5, pharmacist.getGender());
        preparedStatement.setObject(6, pharmacist.getContatctNo());
        preparedStatement.setObject(7, pharmacist.getPostalCode());
        preparedStatement.setObject(8, pharmacist.getStreet());
        preparedStatement.setObject(9, pharmacist.getCity());
        preparedStatement.setObject(10, pharmacist.getDistrict());
        preparedStatement.setObject(11, pharmacist.getEmail());
        preparedStatement.setObject(12, pharmacist.getPharmacistId());
        
        int res = preparedStatement.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }

    public static Pharmacist searchPharmacist(String pharmacistId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Pharmacist where PharmacistID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, pharmacistId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Pharmacist pharmacist = new Pharmacist(resultSet.getString("PharmacistID"), resultSet.getString("EmployeeID"), 
                    resultSet.getString("PharmacistFirstName"), resultSet.getString("PharmacistLastName"), resultSet.getString("PharmacistNIC"), 
                    resultSet.getString("PharmacistDOB"), resultSet.getString("PharmacistGender"), resultSet.getString("PharmacistContactNo"), 
                    resultSet.getString("PharmacistPostalCode"), resultSet.getString("PharmacistStreet"), resultSet.getString("PharmacistCity"), 
                    resultSet.getString("PharmacistDistrict"), resultSet.getString("PharmacistEmail"));
            return pharmacist;
        } else {
            return null;
        }
    }
    
}

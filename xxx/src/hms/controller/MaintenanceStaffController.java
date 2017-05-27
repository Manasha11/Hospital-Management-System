/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.MaintenanceStaff;
import hms.model.Nurse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class MaintenanceStaffController {

    public static boolean addMaintenanceStaff(MaintenanceStaff maintenanceStaff) throws ClassNotFoundException, SQLException {
        String sql = "Insert into MaintenanceStaff values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, maintenanceStaff.getmStaffId());
        preparedStatement.setObject(2, maintenanceStaff.getEmployeeId());
        preparedStatement.setObject(3, maintenanceStaff.getFirstName());
        preparedStatement.setObject(4, maintenanceStaff.getLastName());
        preparedStatement.setObject(5, maintenanceStaff.getNic());
        preparedStatement.setObject(6, maintenanceStaff.getDob());
        preparedStatement.setObject(7, maintenanceStaff.getGender());
        preparedStatement.setObject(8, maintenanceStaff.getContatctNo());
        preparedStatement.setObject(9, maintenanceStaff.getPostalCode());
        preparedStatement.setObject(10, maintenanceStaff.getStreet());
        preparedStatement.setObject(11, maintenanceStaff.getCity());
        preparedStatement.setObject(12, maintenanceStaff.getDistrict());
        preparedStatement.setObject(13, maintenanceStaff.getEmail());
        
        int res = preparedStatement.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }

    public static boolean updateMaintenanceStaff(MaintenanceStaff maintenanceStaff) throws ClassNotFoundException, SQLException {
        String sql = "Update MaintenanceStaff set MStaffFirstName = ?, MStaffLastName = ?, MStafftNIC = ?, MStaffDOB = ?, MStaffGender = ?, "
                + "MStaffContactNo =?, MStaffPostalCode = ?, MStaffStreet = ?, MStaffCity = ?, MStaffDistrict = ?, MStaffEmail = ? where MStaffID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, maintenanceStaff.getFirstName());
        preparedStatement.setObject(2, maintenanceStaff.getLastName());
        preparedStatement.setObject(3, maintenanceStaff.getNic());
        preparedStatement.setObject(4, maintenanceStaff.getDob());
        preparedStatement.setObject(5, maintenanceStaff.getGender());
        preparedStatement.setObject(6, maintenanceStaff.getContatctNo());
        preparedStatement.setObject(7, maintenanceStaff.getPostalCode());
        preparedStatement.setObject(8, maintenanceStaff.getStreet());
        preparedStatement.setObject(9, maintenanceStaff.getCity());
        preparedStatement.setObject(10, maintenanceStaff.getDistrict());
        preparedStatement.setObject(11, maintenanceStaff.getEmail());
        preparedStatement.setObject(12, maintenanceStaff.getmStaffId());
        
        int res = preparedStatement.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }

    public static MaintenanceStaff searchMStaff(String mStaffId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from MaintenanceStaff where MStaffID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, mStaffId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            MaintenanceStaff maintenanceStaff = new MaintenanceStaff(resultSet.getString("MStaffID"), resultSet.getString("EmployeeID"), 
                    resultSet.getString("MStaffFirstName"), resultSet.getString("MStaffLastName"), resultSet.getString("MStafftNIC"), 
                    resultSet.getString("MStaffDOB"), resultSet.getString("MStaffGender"), resultSet.getString("MStaffContactNo"), 
                    resultSet.getString("MStaffPostalCode"), resultSet.getString("MStaffStreet"), resultSet.getString("MStaffCity"), 
                    resultSet.getString("MStaffDistrict"), resultSet.getString("MStaffEmail"));
            return maintenanceStaff;
        } else {
            return null;
        }
    }
    
}

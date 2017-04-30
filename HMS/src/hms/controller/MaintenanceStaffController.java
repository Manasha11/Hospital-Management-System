/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.MaintenanceStaff;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
}

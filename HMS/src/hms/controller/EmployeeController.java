/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Admission;
import hms.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class EmployeeController {

    public static String getEmployeeId(String type) throws ClassNotFoundException, SQLException {
        String sql = "Select EmployeeID from Employee where EmployeeType = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, type);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String employeeId = resultSet.getString("EmployeeID");
            return employeeId;
        } else {
            return null;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.TestResult;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class TestResultController {

    public static boolean addResult(TestResult testResult) throws ClassNotFoundException, SQLException {
        String sql = "Insert into TestResult values (?, ?, ?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, testResult.getResultId());
        preparedStatement.setObject(2, testResult.getTestId());
        preparedStatement.setObject(3, testResult.getPatientId());
        preparedStatement.setObject(4, testResult.getAdmissionId());
        preparedStatement.setObject(5, testResult.getResultDescription());
        
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }
    
}

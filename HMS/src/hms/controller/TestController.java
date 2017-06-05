/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Admission;
import hms.model.Doctor;
import hms.model.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Manasha
 */
public class TestController {

    public static boolean addTest(Test test) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Test values (?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, test.getTestId());
        preparedStatement.setObject(2, test.getTestName());
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }

    public static boolean updateTest(Test test) throws ClassNotFoundException, SQLException {
        String sql = "Update Test set TestName = ? where TestId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, test.getTestName());
        preparedStatement.setObject(2, test.getTestId());
        
        
        int res = preparedStatement.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    public static Test searchTest(String testId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Test where TestId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, testId);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        if (resultSet.next()) {
            Test test = new Test(resultSet.getString("TestId"), resultSet.getString("TestName"));
            return test;
        } else {
            return null;
        }
    }

    public static String getTestId(String testType) throws ClassNotFoundException, SQLException {
        String sql = "Select TestID from Test where TestName = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, testType);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        if (resultSet.next()) {
            String testName = resultSet.getString("TestID");
            return testName;
        } else {
            return null;
        }
    }

    public static ArrayList<Test> getAllTests() throws ClassNotFoundException, SQLException {
        String sql = "Select * From Test";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Test> testList = new ArrayList();
        while (resultSet.next()) {
            testList.add(new Test(resultSet.getString("TestID"), resultSet.getString("TestName")));
        }
        return testList;
    }
    
}

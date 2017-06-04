/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Admission;
import hms.model.Patient;
import hms.model.TestResult;
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
        if (res > 0) {
            return true;
        }
        return false;
    }

    public static ArrayList<TestResult> getAllResults(String patientId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from TestResult where PatientID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, patientId);

        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<TestResult> resultList = new ArrayList();

        while (resultSet.next()) {
            resultList.add(new TestResult(resultSet.getString("ResultID"), resultSet.getString("TestID"), resultSet.getString("PatientID"),
                    resultSet.getString("AdmissionID"), resultSet.getString("ResultDescription")));

        }
        return resultList;
    }

    public static String getPath(String testResultId) throws ClassNotFoundException, SQLException {
        String sql = "Select ResultDescription from TestResult where ResultID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, testResultId);
        
        ResultSet resultSet = preparedStatement.executeQuery();
        String path = "";
        while(resultSet.next()){
            path = resultSet.getString("ResultDescription");
        }
        return path;
    }

}

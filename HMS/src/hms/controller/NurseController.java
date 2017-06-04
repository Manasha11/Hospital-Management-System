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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
        if (res > 0) {
            return true;
        }
        return false;
    }

    public static Nurse searchNurse(String nurseId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Nurse where NurseID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, nurseId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Nurse nurse = new Nurse(resultSet.getString("NurseID"), resultSet.getString("EmployeeID"),
                    resultSet.getString("NurseFirstName"), resultSet.getString("NurseLastName"), resultSet.getString("NurseNIC"),
                    resultSet.getString("NurseDOB"), resultSet.getString("NurseGender"), resultSet.getString("NurseContactNo"),
                    resultSet.getString("NursePostalCode"), resultSet.getString("NurseStreet"), resultSet.getString("NurseCity"),
                    resultSet.getString("NurseDistrict"), resultSet.getString("NurseEmail"));
            return nurse;
        } else {
            return null;
        }
    }

    public static boolean updateNurse(Nurse nurse) throws ClassNotFoundException, SQLException {
        String sql = "Update Nurse set NurseFirstName = ?, NurseLastName = ?, NurseNIC = ?, NurseDOB = ?, NurseGender = ?, "
                + "NurseContactNo =?, NursePostalCode = ?, NurseStreet = ?, NurseCity = ?, NurseDistrict = ?, NurseEmail = ? where NurseID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, nurse.getFirstName());
        preparedStatement.setObject(2, nurse.getLastName());
        preparedStatement.setObject(3, nurse.getNic());
        preparedStatement.setObject(4, nurse.getDob());
        preparedStatement.setObject(5, nurse.getGender());
        preparedStatement.setObject(6, nurse.getContatctNo());
        preparedStatement.setObject(7, nurse.getPostalCode());
        preparedStatement.setObject(8, nurse.getStreet());
        preparedStatement.setObject(9, nurse.getCity());
        preparedStatement.setObject(10, nurse.getDistrict());
        preparedStatement.setObject(11, nurse.getEmail());
        preparedStatement.setObject(12, nurse.getNurseId());

        int res = preparedStatement.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    public static Nurse searchNurseByName(String name) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Nurse where NurseID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Nurse nurse = new Nurse(resultSet.getString("NurseID"), resultSet.getString("EmployeeID"),
                    resultSet.getString("NurseFirstName"), resultSet.getString("NurseLastName"), resultSet.getString("NurseNIC"),
                    resultSet.getString("NurseDOB"), resultSet.getString("NurseGender"), resultSet.getString("NurseContactNo"),
                    resultSet.getString("NursePostalCode"), resultSet.getString("NurseStreet"), resultSet.getString("NurseCity"),
                    resultSet.getString("NurseDistrict"), resultSet.getString("NurseEmail"));
            return nurse;
        } else {
            return null;
        }
    }

    public static ArrayList<Nurse> getAllNurses() throws ClassNotFoundException, SQLException {
        String sql = "Select * From Nurse";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Nurse> nurseList = new ArrayList();
        while (resultSet.next()) {
            nurseList.add(new Nurse(resultSet.getString("NurseID"), resultSet.getString("EmployeeID"),
                    resultSet.getString("NurseFirstName"), resultSet.getString("NurseLastName"), resultSet.getString("NurseNIC"),
                    resultSet.getString("NurseDOB"), resultSet.getString("NurseGender"), resultSet.getString("NurseContactNo"),
                    resultSet.getString("NursePostalCode"), resultSet.getString("NurseStreet"), resultSet.getString("NurseCity"),
                    resultSet.getString("NurseDistrict"), resultSet.getString("NurseEmail")));
        }
        return nurseList;
    }

}

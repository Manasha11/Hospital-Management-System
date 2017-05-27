/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Doctor;
import hms.model.Ward;
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
public class WardController {

    public static boolean addWard(Ward ward) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Ward values(?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, ward.getWardId());
        preparedStatement.setObject(2, ward.getWardType());
        preparedStatement.setObject(3, ward.getDescription());
        
        int res = preparedStatement.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    public static boolean updateWard(Ward ward) throws ClassNotFoundException, SQLException {
        String sql = "Update Ward set WardType = ?, Description = ? where WardId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, ward.getWardType());
        preparedStatement.setObject(2, ward.getDescription());
        preparedStatement.setObject(3, ward.getWardId());
        
        int res = preparedStatement.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    public static Ward searchWard(String wardId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Ward where WardId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, wardId);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        if (resultSet.next()) {
            Ward ward = new Ward(resultSet.getString("WardId"), resultSet.getString("WardType"), resultSet.getString("Description"));
            return ward;
        } else {
            return null;
        }
    }

    public static ArrayList<Ward> getAllWards() throws ClassNotFoundException, SQLException {
        String sql = "Select * From Ward";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Ward> wardList = new ArrayList();
        while (resultSet.next()) {
            wardList.add(new Ward(resultSet.getString("WardID"), resultSet.getString("WardType"), resultSet.getString("Description")));
        }
        return wardList;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class AccountController {

    public static Account searchAccount(String username) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Account where username = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, username);
        
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Account account = new Account(resultSet.getString("FirstName"), resultSet.getString("LastName"), resultSet.getString("Email"), 
                    resultSet.getString("username"), resultSet.getString("password"), resultSet.getString("EmployeeID"));
            return account;
        }else{
            return null;
        }
    }

    public static boolean addAccount(Account account) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Account values(?, ?, ?, ?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, account.getFirstName());
        preparedStatement.setObject(2, account.getLastName());
        preparedStatement.setObject(3, account.getEmail());
        preparedStatement.setObject(4, account.getUsername());
        preparedStatement.setObject(5, account.getPassword());
        preparedStatement.setObject(6, account.getEmployeeId());
        
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class PaymentController {

    public static boolean addPayment(Payment payment) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Payment values (?, ?, ?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, payment.getAdmissionId());
        preparedStatement.setObject(2, payment.getBillId());
        preparedStatement.setObject(3, payment.getDate());
        preparedStatement.setObject(4, payment.getAmount());
        preparedStatement.setObject(5, payment.getNotes());
        
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }
    
}

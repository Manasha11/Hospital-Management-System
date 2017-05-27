/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Admission;
import hms.model.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class BillController {

    public static boolean addBill(Bill bill) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Bill values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, bill.getBillId());
        preparedStatement.setObject(2, bill.getAdmissionId());
        preparedStatement.setObject(3, bill.getPatientId());
        preparedStatement.setObject(4, bill.getMedicalCharge());
        preparedStatement.setObject(5, bill.getServiceCharge());
        preparedStatement.setObject(6, bill.getRoomCharge());
        preparedStatement.setObject(7, bill.getHospitalCharge());
        preparedStatement.setObject(8, bill.getTotal());
        preparedStatement.setObject(9, bill.getDiscount());
        preparedStatement.setObject(10, bill.getNetTotal());
        
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }

    public static Bill searchBill(String admissionId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Bill where AdmissionID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, admissionId);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Bill bill = new Bill(resultSet.getString("BillID"), resultSet.getString("AdmissionID"), resultSet.getString("PatientID"),
                    resultSet.getDouble("MedicalCharge"), resultSet.getDouble("ServiceCharge"), resultSet.getDouble("RoomCharge"),
                    resultSet.getDouble("HospitalCharge"), resultSet.getDouble("Total"), resultSet.getDouble("Discount"), 
                    resultSet.getDouble("NetTotal"));
            return bill;
        } else {
            return null;
        }
    }
    
}

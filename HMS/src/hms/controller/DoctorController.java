/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Doctor;
import hms.model.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class DoctorController {

    public static boolean addDoctor(Doctor doctor) throws SQLException, ClassNotFoundException{
        String sql = "Insert into Doctor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, doctor.getDoctorId());
        preparedStatement.setObject(2, doctor.getEmployeeId());
        preparedStatement.setObject(3, doctor.getFirstName());
        preparedStatement.setObject(4, doctor.getLastName());
        preparedStatement.setObject(5, doctor.getNic());
        preparedStatement.setObject(6, doctor.getDob());
        preparedStatement.setObject(7, doctor.getGender());
        preparedStatement.setObject(8, doctor.getSpecialty());
        preparedStatement.setObject(9, doctor.getDegree());
        preparedStatement.setObject(10, doctor.getRegNum());
        preparedStatement.setObject(11, doctor.getTitle());
        preparedStatement.setObject(12, doctor.getContactNo());
        preparedStatement.setObject(13, doctor.getPostalCode());
        preparedStatement.setObject(14, doctor.getCity());
        preparedStatement.setObject(15, doctor.getStreet());
        preparedStatement.setObject(16, doctor.getDistrict());
        preparedStatement.setObject(17, doctor.getEmail());
        
        int res = preparedStatement.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
        
    }

    public static Doctor searchDoctor(String doctorId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Doctor where DoctorID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, doctorId);
        
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Doctor doctor = new Doctor(resultSet.getString("DoctorID"), resultSet.getString("EmployeeID"), 
                    resultSet.getString("DoctorFirstName"), resultSet.getString("DoctorLastName"), resultSet.getString("DoctorNIC"), 
                    resultSet.getString("DoctorDOB"), resultSet.getString("DoctorGender"), resultSet.getString("Title"), 
                    resultSet.getString("Degrees"), resultSet.getString("RegistrationNo"), resultSet.getString("DoctorID"), 
                    resultSet.getString("DoctorContactNo"), resultSet.getString("DoctorPostalCode"), 
                    resultSet.getString("DoctorStreet"), resultSet.getString("DoctorCity"), resultSet.getString("DoctorDistrict"), 
                    resultSet.getString("DoctorEmail"));
            return doctor;
        } else {
            return null;
        }
    }

}

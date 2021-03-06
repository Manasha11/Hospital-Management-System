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
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Manasha
 */
public class DoctorController {

    public static boolean addDoctor(Doctor doctor) throws SQLException, ClassNotFoundException {
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
        if (res > 0) {
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
                    resultSet.getString("Degrees"), resultSet.getString("RegistrationNo"), resultSet.getString("Specialization"),
                    resultSet.getString("DoctorContactNo"), resultSet.getString("DoctorPostalCode"),
                    resultSet.getString("DoctorStreet"), resultSet.getString("DoctorCity"), resultSet.getString("DoctorDistrict"),
                    resultSet.getString("DoctorEmail"));
            return doctor;
        } else {
            return null;
        }
    }

    public static boolean updateDoctor(Doctor doctor) throws ClassNotFoundException, SQLException {
        String sql = "Update Doctor set DoctorFirstName = ?, DoctorLastName = ?, DoctorNIC = ?, DoctorDOB = ?, DoctorGender = ?, "
                + "Specialization = ?, Degrees = ?, RegistrationNo = ?, Title = ?, "
                + "DoctorContactNo =?, DoctorPostalCode = ?, DoctorStreet = ?, DoctorCity = ?, DoctorDistrict = ?, DoctorEmail = ? where DoctorID = ?";

        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, doctor.getFirstName());
        preparedStatement.setObject(2, doctor.getLastName());
        preparedStatement.setObject(3, doctor.getNic());
        preparedStatement.setObject(4, doctor.getDob());
        preparedStatement.setObject(5, doctor.getGender());
        preparedStatement.setObject(6, doctor.getSpecialty());
        preparedStatement.setObject(7, doctor.getDegree());
        preparedStatement.setObject(8, doctor.getRegNum());
        preparedStatement.setObject(9, doctor.getTitle());
        preparedStatement.setObject(10, doctor.getContactNo());
        preparedStatement.setObject(11, doctor.getPostalCode());
        preparedStatement.setObject(12, doctor.getStreet());
        preparedStatement.setObject(13, doctor.getCity());
        preparedStatement.setObject(14, doctor.getDistrict());
        preparedStatement.setObject(15, doctor.getEmail());
        preparedStatement.setObject(16, doctor.getDoctorId());

        int res = preparedStatement.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    public static ArrayList<Doctor> getAllDoctors() throws ClassNotFoundException, SQLException {
        String sql = "Select * From Doctor";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Doctor> doctorList = new ArrayList();
        while (resultSet.next()) {
            doctorList.add(new Doctor(resultSet.getString("DoctorID"), resultSet.getString("EmployeeID"),
                    resultSet.getString("DoctorFirstName"), resultSet.getString("DoctorLastName"), resultSet.getString("DoctorNIC"),
                    resultSet.getString("DoctorDOB"), resultSet.getString("DoctorGender"), resultSet.getString("Title"),
                    resultSet.getString("Degrees"), resultSet.getString("RegistrationNo"), resultSet.getString("Specialization"),
                    resultSet.getString("DoctorContactNo"), resultSet.getString("DoctorPostalCode"),
                    resultSet.getString("DoctorStreet"), resultSet.getString("DoctorCity"), resultSet.getString("DoctorDistrict"),
                    resultSet.getString("DoctorEmail")));
        }
        return doctorList;
    }

    public static String getDoctorId(String name, String name0) throws ClassNotFoundException, SQLException {
        String sql = "Select DoctorID from Doctor where DoctorFirstName = ? and DoctorLastName = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, name);
        preparedStatement.setObject(2, name0);
        String doctorId = "";
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            doctorId = resultSet.getString("DoctorID");
        }
        return doctorId;
    }

}

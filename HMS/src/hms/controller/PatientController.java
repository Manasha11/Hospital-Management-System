/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Doctor;
import hms.model.EmergencyContact;
import hms.model.Patient;
import hms.model.PatientContact;
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
public class PatientController {

//    public static boolean addPatient(Patient patient, PatientContact patientContact) throws ClassNotFoundException, SQLException {
//        String sql = "Insert into patient values(?, ?, ?, ?, ?, ?, ?, ?)";
//        Connection connection = DBConnection.getDBConnection().getConnection();
//        connection.setAutoCommit(false);
//        try {
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setObject(1, patient.getPatientId());
//            stm.setObject(2, patient.getFirstName());
//            stm.setObject(3, patient.getLastName());
//            stm.setObject(4, patient.getNic());
//            stm.setObject(5, patient.getDob());
//            stm.setObject(6, patient.getGender());
//            stm.setObject(7, patient.getAlergyDetails());
//            stm.setObject(8, patient.getSpecialNotes());
//
//            int res = stm.executeUpdate();
//            if (res > 0) {
//                boolean addPatientContact = PatientContactController.addPatientContact(patientContact);
//                if (addPatientContact) {
//                    connection.commit();
//                    return true;
//                } else {
//                    connection.rollback();
//                }
//            }
//            return false;
//
//        } finally {
//            connection.setAutoCommit(true);
//        }
//    }

//    public static Patient searchPatient(String patientId) throws ClassNotFoundException, SQLException {
//        String sql = "Select * from Patient where PatientID = ?";
//        Connection connection = DBConnection.getDBConnection().getConnection();
//        PreparedStatement stm = connection.prepareStatement(sql);
//        stm.setObject(1, patientId);
//        ResultSet rst = stm.executeQuery();
//        if (rst.next()) {
//            Patient patient = new Patient(rst.getString("PatientID"), rst.getString("PatientFirstName"), rst.getString("PatientLastName"), rst.getString("PatientNIC"), rst.getString("PatientDOB"), rst.getString("PatientGender"), rst.getString("AlergyDetails"), rst.getString("SpecialNotes"));
//            return patient;
//        } else {
//            return null;
//        }
//    }
    public static boolean updatePatient(Patient patient, PatientContact patientContact, EmergencyContact emergencyContac) throws ClassNotFoundException, SQLException {
        String sql = "Update Patient set PatientFirstName = ?, PatientLastName = ?, PatientNIC = ?, PatientDOB = ?, PatientGender = ?, AlergyDetails = ?, SpecialNotes = ? where PatientId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, patient.getFirstName());
            statement.setObject(2, patient.getLastName());
            statement.setObject(3, patient.getNic());
            statement.setObject(4, patient.getDob());
            statement.setObject(5, patient.getGender());
            statement.setObject(6, patient.getAlergyDetails());
            statement.setObject(7, patient.getSpecialNotes());
            statement.setObject(8, patient.getPatientId());

            int res = statement.executeUpdate();
            if (res > 0) {
                boolean updatePatientContact = PatientContactController.updatePatientContact(patientContact);
                if (updatePatientContact) {
                    boolean updateEmergencyContact = EmergencyContactController.updateEmergencyContact(emergencyContac);
                    if (updateEmergencyContact) {
                        connection.commit();
                        return true;
                    } else {
                        connection.rollback();
                    }
                } else {
                    connection.rollback();

                }
            }
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public static boolean addPatient(Patient patient, PatientContact patientContact, EmergencyContact emergencyContact) throws SQLException, ClassNotFoundException {
        String sql = "Insert into patient values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, patient.getPatientId());
            stm.setObject(2, patient.getFirstName());
            stm.setObject(3, patient.getLastName());
            stm.setObject(4, patient.getNic());
            stm.setObject(5, patient.getDob());
            stm.setObject(6, patient.getGender());
            stm.setObject(7, patient.getBloodGroup());
            stm.setObject(8, patient.getAlergyDetails());
            stm.setObject(9, patient.getSpecialNotes());
            stm.setObject(10, patient.getPostalCode());
            stm.setObject(11, patient.getStreet());
            stm.setObject(12, patient.getCity());
            stm.setObject(13, patient.getDistrict());

            int res = stm.executeUpdate();
            if (res > 0) {
                boolean addPatientContact = PatientContactController.addPatientContact(patientContact);
                if (addPatientContact) {
                    boolean addEmergencyContact = EmergencyContactController.addEmergencyContact(emergencyContact);
                    if (addEmergencyContact) {
                        connection.commit();
                        return true;
                    } else {
                        connection.rollback();
                    }
                } else {
                    connection.rollback();
                }
            }
            return false;

        } finally {
            connection.setAutoCommit(true);
        }
    }

    public static Patient searchPatient(String patientId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Patient where PatientID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, patientId);

        ResultSet rst = statement.executeQuery();
        if (rst.next()) {
            Patient patient = new Patient(rst.getString("PatientID"), rst.getString("PatientFirstName"), rst.getString("PatientLastName"), rst.getString("PatientNIC"), rst.getString("PatientDOB"),
                    rst.getString("PatientGender"), rst.getString("BloodGroup"), rst.getString("AlergyDetails"), rst.getString("SpecialNotes"), rst.getString("PatientPostalCode"),
                    rst.getString("PatientStreet"), rst.getString("PatientCity"), rst.getString("PatientDistrict"));
            return patient;
        } else {
            return null;
        }
    }

    public static ArrayList<Patient> getAllPatients() throws ClassNotFoundException, SQLException {
        String sql = "Select * From Patient";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement statement = conn.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        ArrayList<Patient> patientList = new ArrayList();
        while (rst.next()) {
            patientList.add(new Patient(rst.getString("PatientID"), rst.getString("PatientFirstName"), rst.getString("PatientLastName"), rst.getString("PatientNIC"), rst.getString("PatientDOB"),
                    rst.getString("PatientGender"), rst.getString("BloodGroup"), rst.getString("AlergyDetails"), rst.getString("SpecialNotes"), rst.getString("PatientPostalCode"),
                    rst.getString("PatientStreet"), rst.getString("PatientCity"), rst.getString("PatientDistrict")));
        }
        return patientList;
    }

    public static String getPatientId(String name, String name0) throws ClassNotFoundException, SQLException {
        String sql = "Select PatientID from Patient where PatientFirstName = ? and PatientLastName = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, name);
        preparedStatement.setObject(2, name0);
        String patientId = "";
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            patientId = resultSet.getString("PatientID");
        }
        return patientId;
    }
}

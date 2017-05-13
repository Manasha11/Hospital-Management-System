/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Patient;
import hms.model.PatientContact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Manasha
 */
public class PatientController {

//    public static boolean addPatient(Patient patient) throws ClassNotFoundException, SQLException {
//        String sql = "Insert into patient values(?, ?, ?, ?, ?, ?, ?, ?)";
//        Connection connection = DBConnection.getDBConnection().getConnection();
//        //connection.setAutoCommit(false);
//
//        PreparedStatement stm = connection.prepareStatement(sql);
//        stm.setObject(1, patient.getPatientId());
//        stm.setObject(2, patient.getFirstName());
//        stm.setObject(3, patient.getLastName());
//        stm.setObject(4, patient.getNic());
//        stm.setObject(5, patient.getDob());
//        stm.setObject(6, patient.getGender());
//        stm.setObject(7, patient.getAlergyDetails());
//        stm.setObject(8, patient.getSpecialNotes());
//
//        int res = stm.executeUpdate();
//        if (res > 0) {
//            return true;
//
//        }
//        return false;
//
//    }
//
//    public static boolean addPatientContact(PatientContact patientContact) throws ClassNotFoundException, SQLException {
//        String sql = "Insert into PatientContact values(?, ?, ?)";
//        Connection connection = DBConnection.getDBConnection().getConnection();
//        
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setObject(1, patientContact.getPatientID());
//        statement.setObject(2, patientContact.getResidence());
//        statement.setObject(3, patientContact.getMobile());
//        
//        int res = statement.executeUpdate();
//        if(res > 0){
//            
//            return true;
//        }
//        return false;
//    }
    public static boolean addPatient(Patient patient, PatientContact patientContact) throws ClassNotFoundException, SQLException {
        String sql = "Insert into patient values(?, ?, ?, ?, ?, ?, ?, ?)";
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
            stm.setObject(7, patient.getAlergyDetails());
            stm.setObject(8, patient.getSpecialNotes());

            int res = stm.executeUpdate();
            if (res > 0) {
                boolean addPatientContact = PatientContactController.addPatientContact(patientContact);
                if (addPatientContact) {
                    connection.commit();
                    return true;
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
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, patientId);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            Patient patient = new Patient(rst.getString("PatientID"), rst.getString("PatientFirstName"), rst.getString("PatientLastName"), rst.getString("PatientNIC"), rst.getString("PatientDOB"), rst.getString("PatientGender"), rst.getString("AlergyDetails"), rst.getString("SpecialNotes"));
            return patient;
        } else {
            return null;
        }
    }

    public static boolean updatePatient(Patient patient, PatientContact patientContact) throws ClassNotFoundException, SQLException {
        String sql = "Update Patient set PatientFirstName = ?, PatientLastName = ?, PatientNIC = ?, PatientDOB = ?, PatientGender = ?, AlergyDetails = ?, SpecialNotes = ? where PatientId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        
        try{
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
            if(res > 0){
                boolean updatePatientContact = PatientContactController.updatePatientContact(patientContact);
                if(updatePatientContact){
                    connection.commit();
                    return true;
                }else{
                    connection.rollback();
                }
            }
            return false;
        }finally{
            connection.setAutoCommit(true);
        }
    }
}


//public static boolean UpdateDoctor(Doctor doctor, ArrayList<WorkPlace> hospitalList, ArrayList<Shift> shiftList) throws SQLException, ClassNotFoundException {
//        String sql = "Update doctor set docFirstName = ?, docLastName = ?, specialty = ?, degree = ?, docNic = ?, docAddress = ?, docContactNo =? where doctorId = ?";
//        Connection connection = DBConnection.getDBConnection().getConnection();
//        connection.setAutoCommit(false);
//
//        try {
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setObject(8, doctor.getDoctorId());
//            stm.setObject(1, doctor.getDocFirstName());
//            stm.setObject(2, doctor.getDocLastName());
//            stm.setObject(3, doctor.getSpecialty());
//            stm.setObject(4, doctor.getDegree());
//            stm.setObject(5, doctor.getDocNic());
//            stm.setObject(6, doctor.getDocAddress());
//            stm.setObject(7, doctor.getDocContactNo());
//
//            int res = stm.executeUpdate();
//            if (res > 0) {
//                boolean updateWorkPlace = WorkPlaceController.updateWorkPlace(hospitalList);
//                if (updateWorkPlace) {
//                    boolean updateShift = ShiftController.updateShift(shiftList);
//                    if (updateShift) {
//                        connection.commit();
//                        return true;
//                    } else {
//                        connection.rollback();
//                    }
//                } else {
//                    connection.rollback();
//                }
//            }
//            return false;
//        } finally {
//            connection.setAutoCommit(true);
//
//        }
//    }
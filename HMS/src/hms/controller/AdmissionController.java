/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Admission;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Manasha
 */
public class AdmissionController {

    public static boolean addAdmission(Admission admission) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Admission values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, admission.getAdmissionId());
        preparedStatement.setObject(2, admission.getPatientId());
        preparedStatement.setObject(3, admission.getWardId());
        preparedStatement.setObject(4, admission.getDate());
        preparedStatement.setObject(5, admission.getRecommendedBy());
        preparedStatement.setObject(6, admission.getConfirmedBy());
        preparedStatement.setObject(7, admission.getLeadingConsultant());
        preparedStatement.setObject(8, admission.getLeadingConsultantId());
        preparedStatement.setObject(9, admission.getAdvancePayment());
        
        
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }

    public static Admission searchAdmission(String admissionId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Admission where AdmissionID = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, admissionId);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Admission admission = new Admission(resultSet.getString("AdmissionID"), resultSet.getString("PatientID"), resultSet.getString("WardID"), 
                    resultSet.getString("AdmittedDate"), resultSet.getString("RecommendedBy"), resultSet.getString("ConfirmedBy"), 
                    resultSet.getString("LeadingConsultant"), resultSet.getString("LeadingConsultantID"), resultSet.getDouble("AdvancePayment"));
            return admission;
        } else {
            return null;
        }
    }

    public static ArrayList<Admission> getAllAdmissions(String patientId) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Admission where PatientId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, patientId);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Admission> admissionList = new ArrayList();
        while (resultSet.next()) {
            admissionList.add(new Admission(resultSet.getString("AdmissionID"), resultSet.getString("PatientID"), resultSet.getString("WardID"), 
                    resultSet.getString("AdmittedDate"), resultSet.getString("RecommendedBy"), resultSet.getString("ConfirmedBy"), 
                    resultSet.getString("LeadingConsultant"), resultSet.getString("LeadingConsultantID"), resultSet.getDouble("AdvancePayment")));
        }
        return admissionList;
    }
    
}

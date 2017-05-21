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
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class AdmissionController {

    public static boolean addAdmission(Admission admission) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Admission values (?, ?, ?, ?, ?, ?, ?, ?)";
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
        
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }
    
}

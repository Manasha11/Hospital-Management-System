/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class PatientController {

    public static boolean addPatient(Patient patient) throws ClassNotFoundException, SQLException {
        String sql = "Insert into patient values(?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        //connection.setAutoCommit(false);

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
            return true;

        }
        return false;

    }

}

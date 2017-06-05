/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.controller;

import hms.db.DBConnection;
import hms.model.Attendance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Manasha
 */
public class AttendanceController {

    public static boolean addAttendance(Attendance attendance) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Attendance values (?, ?, ?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, attendance.getId());
        preparedStatement.setObject(2, attendance.getDate());
        preparedStatement.setObject(3, attendance.getTime());
        
        int res = preparedStatement.executeUpdate();
        if(res > 0){
            return true;
        }
        return false;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.other;

import hms.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Manasha
 */
public class IDController {

    static String getLastId(String tableName, String columnName) throws ClassNotFoundException, SQLException {
        String sql = " select "+columnName+" from "+tableName+" order by 1 desc limit 1";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet resultSet = stm.executeQuery(sql);
        if(resultSet.next()){
            return resultSet.getString(1);
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.other;

import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author Manasha
 */
public class IDGenerator {
    

    public static String getNewId(String tableName, String columnName, String prefix) throws SQLException, ClassNotFoundException{
        String lastId = IDController.getLastId(tableName, columnName);
        if(lastId != null){
            int Id = Integer.parseInt(lastId.split(prefix)[1]);
            Id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMaximumIntegerDigits(3);
            numberFormat.setGroupingUsed(false);
            String newId = numberFormat.format(Id);
            int numId = Integer.parseInt(newId);
            if(numId<10){
                return prefix +"00"+newId;
            }else if(numId<100){
                return prefix +"0"+newId;
            }else{
                return prefix + newId;
            }
        
        }else{
            return prefix + "001";
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;

public class Deleteservice {
    public static boolean deleteUser(long regdno){
        try{
            Connection cn =repository.connectionDB.getConnectionDB();
            Statement st=cn.createStatement();
            st.executeUpdate("delete from user where regdno='"+regdno+"'");
                return true;
        }catch(Exception ee){
            ee.printStackTrace();
        }
     
        return false;
    }
}
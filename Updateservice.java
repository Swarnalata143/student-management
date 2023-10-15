/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
public class Updateservice {
     public static boolean UpdateUser(String name,Long regdno,String address,String phoneno){
        try{
            Connection cn =repository.connectionDB.getConnectionDB();
            Statement st=cn.createStatement();
            st.executeUpdate("Update user SET name='"+name+"',regdno='"+regdno+"',address='"+address+"',phoneno='"+phoneno+"' where regdno='"+regdno+"'");
                return true;
        }catch(Exception ee){
            ee.printStackTrace();
        }
     
        return false;
    }
}
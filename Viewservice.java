/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;


public class Viewservice {
    public static ResultSet getData(){
        try{
            Connection cn =repository.connectionDB.getConnectionDB();
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("select * from user");
            return rs;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
    import java.sql.*;
    public class Addservice{
    public static boolean AddUser (String name, long regdno, String address, String phone){

        try{
            Connection cn = repository.connectionDB.getConnectionDB(); 
           Statement st = cn.createStatement();
           st.executeUpdate("insert into user  values('"+name+"' , '"+regdno+"' , '"+address+"' , '"+phone+"')");
            return true;
            } catch (Exception ee) {
                ee.printStackTrace();   
        }

        return false;

        }
    
}

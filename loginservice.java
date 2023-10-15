/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service; 
import java.sql.*;
public class loginservice {
    public static boolean validUser(String name,String password){
        try{
            Connection cn =repository.connectionDB.getConnectionDB();
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("select * from admin where user_name='"+name+"' and user_password='"+password+"'");
            while(rs.next()){
                return true;
            }
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
    
}
            
       




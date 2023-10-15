
package service;
import java.sql.*;
public class SingupService {
    public static boolean NewUser(String name,String password){
        try{
            Connection cn =repository.connectionDB.getConnectionDB();
            Statement st=cn.createStatement();
            st.executeUpdate("insert into admin values('"+name+"' , '"+password+"')");
                return true;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.sql.*;
public class connectionDB {
    static Connection cn=null;
    public static Connection getConnectionDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
                    System.out.println("Connected");
        }catch(ClassNotFoundException ee){
            ee.printStackTrace();
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        finally{
            return cn;
        }
    }
    
}

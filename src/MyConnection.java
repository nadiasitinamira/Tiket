
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MyConnection {
    private static Connection mysqlconfig;
    public static Connection getConnection()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/tiket";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        }catch (Exception e) {
            System.err.println("Koneksi gagal "+e.getMessage());
        }
        return mysqlconfig;
    }
}
//    
//    public static Connection getConnection(){
//        
//        Connection con = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/tiket?", "root", "");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        return con;
//    }
//}

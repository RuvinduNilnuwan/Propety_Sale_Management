
package Model;
import java.sql.*;
import java.sql.DriverManager;


public class DBCon {
    static Connection conn;
    static Statement stat=null;
    
    public static Statement getStatementConnection(){
        try{
            //Establish the connection
           String url="jdbc:mysql://localhost:3306/sj_property";
            conn =DriverManager.getConnection(url, "root","");
            // create the class
            stat=conn.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return stat;
    }
    //close the connection
        public static void closeCon() throws SQLException{
        conn.close();
    }
        
    
}

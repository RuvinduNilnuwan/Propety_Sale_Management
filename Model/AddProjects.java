/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Statement;
/**
 *
 * @author pc
 */
public class AddProjects {
    Statement stmt,stmt1,stmt2;
    
    public void addProjectDetails(String ProjectID, String Location , String Size, String Cost, String EstValue, String NoOfBlocks, String Status)
    {
        try {
            stmt = DBCon.getStatementConnection();
            stmt.executeUpdate("INSERT INTO landtable VALUES ('"+ProjectID+"','"+Location+"','"+Size+"','"+Cost+"','"+EstValue+"','"+NoOfBlocks+"','"+Status+"')");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Statement;
/**
 *
 * @author ruvin
 */
public class ResBlocks {
    Statement stmt,stmt1,stmt2;
    
    public void resblocks(String Bkid, String Proid, String Nic, String Cid, String Cuname, String Addes, String Loc, String Agree, String Pay, String Dte){
    try {
            stmt = DBCon.getStatementConnection();
            stmt.executeUpdate("INSERT INTO restble VALUES ('"+Bkid+"','"+Proid+"','"+Nic+"','"+Cid+"','"+Cuname+"','"+Addes+"','"+Loc+"','"+Agree+"','"+Pay+"','"+Dte+"')");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }
    
}

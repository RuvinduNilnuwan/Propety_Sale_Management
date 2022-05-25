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
public class AddBlocks {
    Statement stmt,stmt1,stmt2;
    
    public void addBlockDetails(String BlockID, String BlockSize , String Cost, String EstValue, String Status)
    {
        try {
            stmt = DBCon.getStatementConnection();
            stmt.executeUpdate("INSERT INTO blocktable VALUES ('"+BlockID+"','"+BlockSize+"','"+Cost+"','"+EstValue+"','"+Status+"')");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

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
public class AddBlocks1 {
    Statement stmt,stmt1,stmt2;
    
    public void addBlockDetails(String BlockID, String Id, String BlockSizeAcres ,String BlockSizeRoods,String BlockSizePerches, String PerchPrice, String EstValue, String Status)
    {
        try {
            stmt = DBCon.getStatementConnection();
            stmt.executeUpdate("INSERT INTO blocktable VALUES ('"+BlockID+"','"+Id+"','"+BlockSizeAcres+"','"+BlockSizeRoods+"','"+BlockSizePerches+"','"+PerchPrice+"','"+EstValue+"','"+Status+"')");
            stmt.executeUpdate("INSERT INTO blocktable1 VALUES ('"+BlockID+"','"+Id+"','"+BlockSizeAcres+"','"+BlockSizeRoods+"','"+BlockSizePerches+"','"+PerchPrice+"','"+EstValue+"','"+Status+"')");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
     public void addLandAndBlockDetails(String LandID, String BlockID)
    {
        try {
            stmt = DBCon.getStatementConnection();
            stmt.executeUpdate("INSERT INTO blockandlandtable VALUES ('"+LandID+"','"+BlockID+"')");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

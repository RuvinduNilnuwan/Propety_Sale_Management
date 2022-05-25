/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import com.mysql.jdbc.Statement;
import Model.DBCon;
/**
 *
 * @author pc
 */
public class EditBlock1 {
    Statement stmt;
    
     public void editaBlock(String BlockID, String SizeAcres, String SizeRoods, String SizePerches, String PerchPrice, String EstValue, String Status)
    {
        try {
            stmt = (Statement) DBCon.getStatementConnection();
            stmt.executeUpdate("UPDATE blocktable SET BlockSizeAcres='"+SizeAcres+"',BlockSizeRoods='"+SizeRoods+"',BlockSizePerches='"+SizePerches+"',PriceOfPerch='"+PerchPrice+"',BlockEstimatedValue='"+EstValue+"',BlockAvailability='"+Status+"'  WHERE BlockID='"+BlockID+"' ");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

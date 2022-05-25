/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Statement;

/**
 *
 * @author ruvin
 */
public class EdiitBlock2 {
    Statement stmt;
    
     public void editaBlock1(String BlockID, String SizeAcres, String SizeRoods, String SizePerches, String PerchPrice, String EstValue, String Status)
    {
        try {
            stmt = (Statement) DBCon.getStatementConnection();
            stmt.executeUpdate("UPDATE blocktable1 SET BlockSizeAcres='"+SizeAcres+"',BlockSizeRoods='"+SizeRoods+"',BlockSizePerches='"+SizePerches+"',PriceOfPerch='"+PerchPrice+"',BlockEstimatedValue='"+EstValue+"',BlockAvailability='"+Status+"'  WHERE BlockID='"+BlockID+"' ");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

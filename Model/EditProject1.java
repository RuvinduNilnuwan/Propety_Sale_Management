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
public class EditProject1 {
    Statement stmt;
    
     public void editaProject(String ProjectID, String Location , String SizeAcres, String SizeRoods,String SizePerches, String Cost, String EstValue, String NoOfBlocks, String Status)
    {
        try {
            stmt = (Statement) DBCon.getStatementConnection();
            stmt.executeUpdate("UPDATE landtable SET LandLocation='"+Location+"',LandSizeAcres='"+SizeAcres+"',LandSizeRoods='"+SizeRoods+"',LandSizePerches='"+SizePerches+"',LandCost='"+Cost+"',LandEstimatedValue='"+EstValue+"',NumberOfBlocks='"+NoOfBlocks+"',LandAvailability='"+Status+"'  WHERE LandID='"+ProjectID+"' ");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

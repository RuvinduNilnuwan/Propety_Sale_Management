/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import com.mysql.jdbc.Statement;
import Model.DBCon;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class EditProject {
    Statement stmt;
    
     public void editaProject(String ProjectID, String Location , String Size, String Cost, String EstValue, String NoOfBlocks, String Status)
    {
        try {
            stmt = (Statement) DBCon.getStatementConnection();
            stmt.executeUpdate("UPDATE landtable SET LandLocation='"+Location+"',LandSize='"+Size+"',LandCost='"+Cost+"',LandEstimatedValue='"+EstValue+"',NumberOfBlocks='"+NoOfBlocks+"',LandAvailability='"+Status+"'  WHERE LandID='"+ProjectID+"' ");
            JOptionPane.showMessageDialog(null," Record has Been Updated ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

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
public class EditBlock {
    Statement stmt;
    
     public void editaBlock(String BlockID, String Size, String Cost, String EstValue, String Status)
    {
        try {       
            stmt = (Statement) DBCon.getStatementConnection();
            stmt.executeUpdate("UPDATE blocktable SET BlockSize='"+Size+"',BlockCost='"+Cost+"',BlockEstimatedValue='"+EstValue+"',BlockAvailability='"+Status+"'  WHERE BlockID='"+BlockID+"' ");       
            JOptionPane.showMessageDialog(null," Record has Been Updated ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

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
public class DeleteBlock {
 Statement stmt;
    
    public void deleteaBlock(String BlockID) {
        
        try {       
            stmt = (Statement) DBCon.getStatementConnection();
            stmt.executeUpdate("DELETE t1,t2 FROM blocktable t1 INNER JOIN blockandlandtable t2 ON t1.BlockID = t2.BlockID WHERE t1.BlockID = '"+BlockID+"' ");  
           
            JOptionPane.showMessageDialog(null," Done", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}

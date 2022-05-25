/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hansi
 */
public class DeleteProject {
 Statement stmt;
    public void deleteaProject(String ProjectID) {
        try {       
            stmt = (Statement) DBCon.getStatementConnection();
            //stmt.executeUpdate("DELETE t1,t2,t3 FROM landtable t1 INNER JOIN blockandlandtable t2 ON t1.LandID = t2.LandID INNER JOIN blocktable t3 ON t2.BlockID = t3.BlockID WHERE t1.LandID='"+ProjectID+"' ");    
              stmt.executeUpdate("DELETE t1,t2,t3 FROM landtable t1 INNER JOIN blockandlandtable t2 ON t1.LandID = t2.LandID INNER JOIN blocktable t3 ON t2.BlockID = t3.BlockID WHERE t1.LandID='"+ProjectID+"' ");
            JOptionPane.showMessageDialog(null,"Project and related blocks have been deleted successfully.", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}

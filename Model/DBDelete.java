/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



    
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBDelete {
    ResultSet rs;
    Statement stmt;
    
    public void deleteUser(String UserID){
        try{

            stmt=(Statement) DBCon.getStatementConnection();
            stmt.executeUpdate("DELETE FROM usertable where UserID='"+UserID+"'");
            JOptionPane.showMessageDialog(null,"User has been deleted successfully");
            
            }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"User can't be deleted");
        }
    }
    
    public void deleteCustomer(String CustomerID){
        try{

           stmt=(Statement) DBCon.getStatementConnection();
            stmt.executeUpdate("DELETE FROM customertable where CustomerID='"+CustomerID+"'");
            JOptionPane.showMessageDialog(null,"Customer has been deleted successfully");
            
            }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Customer can't be deleted");
        }
    }
}

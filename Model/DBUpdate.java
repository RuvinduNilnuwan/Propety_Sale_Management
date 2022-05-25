/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class DBUpdate {
    
    public void updateUser(String UserID,String UserName,String UserRole){
        try{
            Statement stmt = DBCon.getStatementConnection();
            stmt.executeUpdate ("UPDATE usertable set Name='"+UserName+"',UserRole='"+UserRole+"' where UserID='"+UserID+"'");
            JOptionPane.showMessageDialog(null,"User has been updated successfully");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Enter Valid Details");
        
    }
    }
    
    public void updateCustomer(String CustomerID,String CustomerName, String NIC, String Telephone, String Address, String Email){
        try{
            Statement stmt = DBCon.getStatementConnection();
            stmt.executeUpdate ("UPDATE customertable set CustomerName='"+CustomerName+"',CustomerNICNumber='"+NIC+"',CustomeContactNumber='"+Telephone+"',CustomerAddress='"+Address+"',CustomerEmailAddress='"+Email+"' where CustomerID='"+CustomerID+"'");
            JOptionPane.showMessageDialog(null,"Customer has been updated successfully");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Enter Valid Details");
            System.out.println(e);
    }
    }
    public void updatebalanceDueAmount(String BalanceDueAmount,String CustomerID){
        try{
            Statement stmt = DBCon.getStatementConnection();
            stmt.executeUpdate ("UPDATE monthlyamounttable set BalanceDueAmount='"+BalanceDueAmount+"' where CustomerID='"+CustomerID+"'");
            //JOptionPane.showMessageDialog(null,"Customer has been updated successfully");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Enter 1111Valid Details");
            System.out.println(e);
    }
    }
    
    public void updatedueDate(String Date,String CustomerID){
        try{
            Statement stmt = DBCon.getStatementConnection();
            stmt.executeUpdate ("UPDATE monthlyamounttable set NextDueDate='"+Date+"' where CustomerID='"+CustomerID+"'");
            //JOptionPane.showMessageDialog(null,"Customer has been updated successfully");
            
        }
        catch (Exception e){
            
            e.printStackTrace();
    }
    }
    public void updatebalanceTotalAmount(String totalBalance,String CustomerID){
        try{
            Statement stmt = DBCon.getStatementConnection();
            stmt.executeUpdate ("UPDATE monthlyamounttable set BalanceOfHirePurchaseAmount='"+totalBalance+"' where CustomerID='"+CustomerID+"'");
            //JOptionPane.showMessageDialog(null,"Customer has been updated successfully");
            
        }
        catch (Exception e){
            
            e.printStackTrace();
    }
    }
    
    
    
    
}

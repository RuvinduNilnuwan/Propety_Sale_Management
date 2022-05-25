
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DBAdd {
    ResultSet rs;
    Statement stmt;
    
    public void addNewCustomer(String ID,String Name,String NIC, String Telephone, String Address, String Email,String UserID){
        try{
           stmt=(Statement) DBCon.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO customertable VALUES('"+ID+"','"+Name+"','"+NIC+"','"+Telephone+"','"+Address+"','"+Email+"')");
            stmt.executeUpdate
            ("INSERT INTO customerregistration VALUES('"+ID+"','"+UserID+"')");
            
            JOptionPane.showMessageDialog(null, "New user has been added successfully! ");
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Check Again! ");
        //e.printStackTrace();
    }
    }
        
    public void addNewUser(String UserID,String UserName,String UserRole,String Password){
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO usertable VALUES('"+UserID+"','"+UserName+"','"+UserRole+"')");
            
            stmt.executeUpdate
            ("INSERT INTO logintable VALUES('"+UserID+"','"+UserName+"','"+Password+"')");
            JOptionPane.showMessageDialog(null, "User Added Successfully");
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Enter Valid Details ");
        //e.printStackTrace();
    }
    }
    
    public void addMonthlyPayment(String CustomerID,String paymentAmount,String BalanceDueAmount,String CurrentDate,String Status){
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO paymenttable VALUES('"+CustomerID+"','"+paymentAmount+"','"+BalanceDueAmount+"','"+CurrentDate+"','"+Status+"')");
            
            
            JOptionPane.showMessageDialog(null, "Rs. "+paymentAmount+" has been paid sucessfully");
            
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        //e.printStackTrace();
    }
    }   
    
    public void addNewAgreement(String AgreementNumber, String ProjectId, String BlockNumber, String CustomerId, String LandValue, String AdvancePayment, String BalanceAmount, String Installments, String MonthlyInstallment,String HirePurchaseAmount, String BalanceOfHPA, String TotalInterest,String PlatRate,String AgreementDate,String CompletedDate,String DueDate, String FirstPaymentDate){
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO agreementtable VALUES('"+AgreementNumber+"','"+ProjectId+"','"+BlockNumber+"','"+CustomerId+"','"+LandValue+"','"+AdvancePayment+"','"+BalanceAmount+"','"+Installments+"','"+MonthlyInstallment+"','"+HirePurchaseAmount+"','"+BalanceOfHPA+"','"+TotalInterest+"','"+PlatRate+"','"+AgreementDate+"','"+CompletedDate+"','"+DueDate+"','"+FirstPaymentDate+"')");
            JOptionPane.showMessageDialog(null, "Agreement Data Saved Successfully");

            
        }catch (Exception e){
            
           JOptionPane.showMessageDialog(null, "Enter Valid Details");
        
    }
    }
    
    public void addFullPayment(String AgreementNumber, String ProjectId, String BlockNumber, String CustomerId, String LandValue,String AgreementDate){
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO fullpaymenttable VALUES('"+AgreementNumber+"','"+ProjectId+"','"+BlockNumber+"','"+CustomerId+"','"+LandValue+"','"+AgreementDate+"')");
            JOptionPane.showMessageDialog(null, "Agreement Data Saved Successfully");

            
        }catch (Exception e){
            
           JOptionPane.showMessageDialog(null, "Enter Valid Details");
        
    }
    }
    
    public void addNewMonthlyAmount(String CustomerId,String MonthlyInstallment,String FirstPaymentDate,String BalanceOfHPA,String BalanceDueAmount){
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO monthlyamounttable VALUES('"+CustomerId+"','"+MonthlyInstallment+"','"+FirstPaymentDate+"','"+BalanceOfHPA+"','"+BalanceDueAmount+"')");
            //JOptionPane.showMessageDialog(null, "Data added successfully.");

            
        }catch (Exception e){
            
           //JOptionPane.showMessageDialog(null, "Enter Valid Details");
        //e.printStackTrace();
    }
    }   
    
}

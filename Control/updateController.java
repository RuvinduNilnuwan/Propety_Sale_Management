/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author pc
 */
public class updateController {
    
    public static void updateUser(String UserID,String UserName,String UserRole){
        new Model.DBUpdate().updateUser(UserID,UserName,UserRole);
        
    }
    
    public static void updateCustomer(String CustomerID,String CustomerName,String NIC,String Telephone,String Address, String Email){
        new Model.DBUpdate().updateCustomer(CustomerID,CustomerName,NIC,Telephone,Address,Email);
        
    }
    public static void updatebalanceDueAmount(String BalanceDueAmount,String CustomerID){
        new Model.DBUpdate().updatebalanceDueAmount(BalanceDueAmount,CustomerID);
        
    }
    public static void updatedueDate(String Date,String CustomerID){
        new Model.DBUpdate().updatedueDate(Date,CustomerID);
        
    }
    public static void updatebalanceTotalAmount(String totalBalance,String CustomerID){
        new Model.DBUpdate().updatebalanceTotalAmount(totalBalance,CustomerID);
        
    }
    
    
    
    
}

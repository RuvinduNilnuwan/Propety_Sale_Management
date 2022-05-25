/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class DeleteControl {

   
     public static void  deleteBlock(String BlockID)
   {
       new Model.DeleteBlock().deleteaBlock(BlockID);
              
      //JOptionPane.showMessageDialog(null," Record has Been Deleted ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
        public static void  deleteBlock1(String BlockID)
   {
       new Model.DeleteBlock1().deleteaBlock1(BlockID);
              
      //JOptionPane.showMessageDialog(null," Record has Been Deleted ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }

    public static void deleteProject(String ProjectID) 
    {
       new Model.DeleteProject().deleteaProject(ProjectID);
              
      //JOptionPane.showMessageDialog(null," Record has Been Deleted ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
    }
    //.......................................................................
    public static void deleteUser(String UserID){
        
        new Model.DBDelete().deleteUser(UserID);
        
    }

    
    public static void deleteCustomer(String CustomerID){
        
        new Model.DBDelete().deleteCustomer(CustomerID);
        
    }
    
}

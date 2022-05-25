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
public class EditControl1 {
    public static void editProject(String ProjectID, String Location , String SizeAcres,String SizeRoods,String SizePerches, String Cost, String EstValue, String NoOfBlocks, String Status)
   {
       new Model.EditProject1().editaProject(ProjectID, Location, SizeAcres,SizeRoods, SizePerches,Cost, EstValue, NoOfBlocks, Status);
              
      JOptionPane.showMessageDialog(null," Record has Been Updated ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
    
    public static void editBlock(String BlockID, String SizeAcres,String SizeRoods,String SizePerches,String PerchPrice, String EstValue, String Status)
   {
       new Model.EditBlock1().editaBlock(BlockID,SizeAcres,SizeRoods,SizePerches,PerchPrice, EstValue,Status);
              
      JOptionPane.showMessageDialog(null," Record has Been Updated ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
     public static void editBlock1(String BlockID, String SizeAcres,String SizeRoods,String SizePerches,String PerchPrice, String EstValue, String Status)
   {
       new Model.EdiitBlock2().editaBlock1(BlockID,SizeAcres,SizeRoods,SizePerches,PerchPrice, EstValue,Status);
              
      JOptionPane.showMessageDialog(null," Record has Been Updated ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
}

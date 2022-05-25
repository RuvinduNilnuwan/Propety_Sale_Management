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
public class EditControl {
    
    public static void editProject(String ProjectID, String Location , String Size, String Cost, String EstValue, String NoOfBlocks, String Status)
   {
       new Model.EditProject().editaProject(ProjectID, Location, Size, Cost, EstValue, NoOfBlocks, Status);
              
      //JOptionPane.showMessageDialog(null," Record has Been Updated ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
    
    public static void editBlock(String BlockID, String Size, String Cost, String EstValue, String Status)
   {
       new Model.EditBlock().editaBlock(BlockID, Size, Cost, EstValue, Status);
              
      //JOptionPane.showMessageDialog(null," Record has Been Updated ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
}

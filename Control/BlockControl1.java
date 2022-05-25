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
public class BlockControl1 {
    public static void addBlocks (String BlockID, String Id, String BlockSizeAcres ,String BlockSizeRoods,String BlockSizePerches, String PerchPrice,String EstValue, String Status)
   {
          new Model.AddBlocks1().addBlockDetails(BlockID, Id, BlockSizeAcres, BlockSizeRoods, BlockSizePerches ,PerchPrice, EstValue, Status);
       
      JOptionPane.showMessageDialog(null," Add records to Blocks ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
    
    public static void addLandAndBlock (String LandID, String BlockID)
   {
          new Model.AddBlocks1().addLandAndBlockDetails(LandID, BlockID);
       
      //JOptionPane.showMessageDialog(null," Add records to Blocks ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
}

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
public class BlockControl {
    public static void addBlocks (String BlockID, String BlockSize , String Cost, String EstValue, String Status)
   {
          new Model.AddBlocks().addBlockDetails(BlockID, BlockSize, Cost, EstValue, Status);
       
      JOptionPane.showMessageDialog(null," Add records to Blocks ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
}

    
    



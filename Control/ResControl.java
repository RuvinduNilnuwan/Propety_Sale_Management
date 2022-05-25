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
public class ResControl {
    public static void resblock (String Bkid, String Proid, String Nic, String Cid, String Cuname, String Addes, String Loc, String Agree, String Pay, String Dte){
    
        new Model.ResBlocks().resblocks(Bkid, Proid, Nic, Cid, Cuname, Addes, Loc, Agree, Pay, Dte);
        JOptionPane.showMessageDialog(null," Add records to Blocks Resevation ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
}

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
public class ProjectControl {
    public static void addProjects (String ProjectID, String Location , String Size, String Cost, String EstValue, String NoOfBlocks, String Status)
   {
          new Model.AddProjects().addProjectDetails(ProjectID, Location, Size, Cost, EstValue, NoOfBlocks, Status);
       
      JOptionPane.showMessageDialog(null," Add records to Projects ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
}

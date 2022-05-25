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
public class ProjectControl1 {
    public static void addProjects1 (String ProjectID, String Location , String SizeAcres,String SizeRoods,String SizePerches,String Cost, String EstValue, String NoOfBlocks, String Status)
   {
          new Model.AddProjects1().addProjectDetails(ProjectID, Location, SizeAcres,SizeRoods, SizePerches, Cost, EstValue, NoOfBlocks, Status);
       
      JOptionPane.showMessageDialog(null," Added records to Projects ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
}

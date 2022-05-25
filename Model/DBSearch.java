
package Model;
import Model.DBCon;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.*;


import java.sql.*;
public class DBSearch {
    
    Statement stmt;
    ResultSet rs ;
    ResultSet rs1 ;
    ResultSet rs2;
    public ResultSet searchLogin(String userName,String Password) //Login seach
    {
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            
            rs=stmt.executeQuery("select usertable.UserID,usertable.UserRole,logintable.UserName from usertable inner join logintable on usertable.UserID=logintable.UserID where logintable.UserName='"+userName+"' and logintable.Password='"+Password+"';");               
                        
        } catch(Exception e){
            e.printStackTrace();
        }
        return rs;      
    }

     public ResultSet serchCustomers(String id){ // load customers name, NIC and Address
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            rs=stmt.executeQuery("SELECT  * FROM customertable WHERE CustomerID='"+ id +"'");
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;
    }
     
     public ResultSet serchCustomers1(String id1){ // load customers name, NIC and Address
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            rs=stmt.executeQuery("SELECT  * FROM customertable WHERE CustomerID='"+ id1 +"'");
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;
    }
     public ResultSet serchCustomers2(String id2){ // load customers name, NIC and Address
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            rs=stmt.executeQuery("SELECT  * FROM customertable WHERE CustomerID='"+ id2 +"'");
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;
    }
     


    public ResultSet serchCustomer() { //load CustomerIDS
          try{
            stmt=(Statement) DBCon.getStatementConnection();
            rs=stmt.executeQuery("SELECT  * FROM customertable ");   
        }catch(Exception e){
            e.printStackTrace();
        }
         return rs;
    }

    public ResultSet serchLands() { //load Land IDS
          try{
            stmt=(Statement) DBCon.getStatementConnection();
            rs=stmt.executeQuery("SELECT  * FROM blockandlandtable ");   
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet serchBlocks() {//load Block IDS
        try{
            stmt=(Statement) DBCon.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM blockandlandtable WHERE landID=LandID ");     
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }


// ..............................................................................

     
     //++++++++++++++++++++++++++++++++++++++++Edit Method+++++++++++++++++++++++++++++++++++++++++++++
     public ResultSet editprojects() {
        try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM landtable");
            
        }
        
        catch(Exception e)
        {
            
        }
         return rs;
    }

     public ResultSet editblocks() {
        try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blocktable");
            
        }
        
        catch(Exception e)
        {
            
        }
         return rs;
    }
     //++++++++++++++++++++++++++++++++++++++++++++Search Method+++++++++++++++++++++++++++++++++++++
     public ResultSet searchprojects() {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM landtable");
       }
        
        catch(Exception e)
        {
            
        }
         return rs;
    }
     
    public ResultSet searchaproject(String id) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM landtable  where LandID='"+id+"'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
     public ResultSet searchaproject1(String id) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM landtable  where LandID='"+id+"'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
     
     
     public ResultSet searchaproject2(String projectid4) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM landtable  where LandID='"+projectid4+"'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
     public ResultSet loadland()
    {
        try
        {
          stmt=(Statement) DBCon.getStatementConnection();

         rs = stmt.executeQuery("SELECT * FROM landtable");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
     
     
   
    public ResultSet searchblocks() {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blocktable1");
       }
        
        catch(Exception e)
        {
            
        }
         return rs;
    }
     
    public ResultSet searchablock(String id) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blocktable  where BlockID='"+id+"'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
    
    
     public ResultSet searchablock1(String id) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
           // rs =stmt.executeQuery("SELECT * FROM blocktable  where BlockID='"+id+"'");
           
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
     public ResultSet searchablock2(String id) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blocktable  where BlockID='"+id+"'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
     
     
    
    public ResultSet searchadvancerate(String ratename) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs1 = stmt.executeQuery("SELECT * FROM ratetable  where RateName='AdvanceRate'");
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs1;
    }
    
    public ResultSet searchannumrate(String ratename) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs2 = stmt.executeQuery("SELECT * FROM ratetable  where RateName='AnnumRate'");
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs2;
    }
    //...................................................................
     public ResultSet loadAvailableCustomers ()
    {
        try
        {
          stmt=(Statement) DBCon.getStatementConnection();
            
         rs = stmt.executeQuery("SELECT * FROM customertable");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet loadAvailableCustomers (String CustomerID)
    {
        try
        {
          stmt=(Statement) DBCon.getStatementConnection();
            
         rs = stmt.executeQuery("SELECT * FROM customertable where CustomerID='"+CustomerID+"'");
            System.out.println("here");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet loadAvailableUsers ()
    {
        try
        {
         stmt=(Statement) DBCon.getStatementConnection();
           
         rs = stmt.executeQuery("SELECT * FROM usertable");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet loadUserIDs()
    {
        try
        {
          stmt=(Statement) DBCon.getStatementConnection();

         rs = stmt.executeQuery("SELECT * FROM usertable");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet loadUserDetails(String UserID)
    {
        
        try
        {
         System.out.println(UserID);
          stmt=(Statement) DBCon.getStatementConnection();

        rs = stmt.executeQuery("SELECT * FROM customertable where CustomerID='Customer2'");
         System.out.println(rs.getString("CustomerName"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet loadCustomerIDs()
    {
        
        try
        {
         
         stmt=(Statement) DBCon.getStatementConnection();

        rs = stmt.executeQuery("SELECT * FROM customertable");
         
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
///..............Block Value..............................
    public ResultSet serchBlockValue(String bid) {
         try
        {
         
         stmt=(Statement) DBCon.getStatementConnection();
         
         rs = stmt.executeQuery("SELECT * FROM blocktable  where  BlockID ='"+bid+"' ");
         
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
       
    }
    public ResultSet LoadId() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM landtable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
    
    
    public ResultSet searchcount(String landid) {
            try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT COUNT(BlockID) AS Frequency FROM blockandlandtable where LandID='"+landid+"'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
    
    public ResultSet searchDueAmount(String CustomerID){
        try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM monthlyamounttable where CustomerID='"+CustomerID+"'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
    public ResultSet searchLateInterestRate(){
        try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM ratetable where RateName='LateInterestRate'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
    public ResultSet searchblk(){
        try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT BlockID FROM blocktable");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
    public ResultSet LoadIdbl() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blocktable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
    
    public ResultSet serchPaymentHistory(String CustomerID){
        try {
            stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM paymenttable where CustomerID='"+CustomerID+"'");
            
       }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return rs;
    }
    public ResultSet esytble(){
        try{
        stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM agreementtable");
        
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        return rs;
    }
    public ResultSet rest(){
        try{
        stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM restble");
        
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        return rs;
    }
    
    
     public ResultSet fptble(String prdd){
        try{
        stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM fullpaymenttable where ProjectId='"+prdd+"'");
        
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        return rs;
    }
    public ResultSet fultble(){
        try{
        stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM fullpaymenttable");
        
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        return rs;
    
    
    }
    public ResultSet estble(String proidd){
        try{
        stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM agreementtable where ProjectId='"+proidd+"'");
        
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        return rs;
    
    
    }
    
    public ResultSet filterble(String projid){
        try{
        stmt = (com.mysql.jdbc.Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blocktable1 where Proid='"+projid+"'");
        
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        return rs;
    
    
    }
    
    
    
     public ResultSet LoadIdBlock() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blockandlandtable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
     public ResultSet Loadfilter() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blocktable1");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
      public ResultSet LoadNIC() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM customertable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
       public ResultSet Loadptoid() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM agreementtable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
       public ResultSet Loadfpyd() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM fullpaymenttable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
                
      public ResultSet LoadNIC1() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM customertable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
    public ResultSet LoadNIC2() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM customertable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }
    public ResultSet LoadIdBlock2() {
            try {
            stmt = (Statement) DBCon.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM blockandlandtable");
            
       }
        
        catch(Exception e)
        {
             e.printStackTrace();
        }
         return rs;
    }

}
   


    


    


package Control;


public class addController {
    
    //Adding a new customer
    public static void addNewCustomer(String ID,String Name,String NIC, String Telephone, String Address, String Email,String UserID){
        new Model.DBAdd().addNewCustomer(ID,Name,NIC,Telephone,Address,Email,UserID);
        System.out.println("UserID :"+UserID);
    }
    public static void addNewUser(String UserID,String UserName,String UserRole,String Password){
        new Model.DBAdd().addNewUser(UserID,UserName,UserRole,Password);
        System.out.println("Controller");
    }
    public static void addMonthlyPayment(String CustomerID,String paymentAmount,String BalanceDueAmount,String CurrentDate,String Status){
        new Model.DBAdd().addMonthlyPayment(CustomerID,paymentAmount,BalanceDueAmount,CurrentDate,Status);
        System.out.println("Controller");
    }
    public static void addNewAgreement(String AgreementNumber, String ProjectId, String BlockNumber, String CustomerId, String LandValue, String AdvancePayment, String BalanceAmount,String Installments, String MonthlyInstallment,String HirePurchaseAmount, String BalanceOfHPA, String TotalInterest,String PlatRate,String AgreementDate,String CompletedDate,String DueDate, String FirstPaymentDate){
        new Model.DBAdd().addNewAgreement(AgreementNumber, ProjectId, BlockNumber, CustomerId, LandValue,AdvancePayment,BalanceAmount,Installments,MonthlyInstallment,HirePurchaseAmount, BalanceOfHPA,TotalInterest,PlatRate,AgreementDate,CompletedDate,DueDate,FirstPaymentDate);
        }
    public static void addFullPayment(String AgreementNumber, String ProjectId, String BlockNumber, String CustomerId, String LandValue,String AgreementDate){
        new Model.DBAdd().addFullPayment(AgreementNumber, ProjectId, BlockNumber, CustomerId, LandValue,AgreementDate);
        }
    public static void addNewMonthlyAmount(String CustomerId,String MonthlyInstallment,String FirstPaymentDate,String BalanceOfHPA,String BalanceDueAmount){
        new Model.DBAdd().addNewMonthlyAmount(CustomerId,MonthlyInstallment,FirstPaymentDate,BalanceOfHPA,BalanceDueAmount);
        
    } 
    
}



public class TestBankAccount{
    public static void main(String[] args){

        
        //Details - The first account.This is the account which has the withdrawal method too.
        //Details1 - The second account   
        
        
        BankAccount details = new BankAccount();
        BankAccount details1 = new BankAccount();

        
        details.addMoney(500);
        System.out.println("Checking Balance is: $" + details.getcheckingBalance());

        details.addMoney(450);
        System.out.println("Checking Balance is: $" + details.getcheckingBalance());

        details.withdrawMoney(200);
        System.out.println("The new account checking balance is: $" + details.getcheckingBalance());
    

        System.out.println("Both accounts have: $" + BankAccount.getTotalBalance());
    }
}
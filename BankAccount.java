public class BankAccount{

    private double checkingBalance;
    private double savingBalance;

    private static int numAccounts = 0;
    private static double moneyAccount = 0.0;

//Constructor

    BankAccount(){
        numAccounts++;
    }

//Getters of both accounts

    public double getcheckingBalance(){
        return this.checkingBalance;
    }

    public double getsavingBalance(){
        return this.savingBalance;
    }


// Creating a method to add money in the first account - checkingBalance.
    
    public void addMoney(double amount){
          if (amount > 0) {
            checkingBalance += amount;
            moneyAccount += amount;
          }
    }
// Creating a method to add money in the second account - savingBalance.

    public void addMoney1 (double amount){
          if (amount > 0) {
            savingBalance += amount;
            moneyAccount += amount;
          }
    }
    
//Creating a method to withdraw money only from the first account - checkingBalance.

     public void withdrawMoney(double amount) {
        if (amount > 0) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount; 
                moneyAccount -= amount;    
            }
        }
     }

//A method to check the total of both accounts,getter.

     public static double getTotalBalance() {
        return moneyAccount;
   

    }
}
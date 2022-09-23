package Assingnmet;

public class SavingAccount extends Account{
                String accountType="saving";
                long balance=345355;

                public void getSavingAccountDetails(String accountType,long balance){
                    System.out.println("AccountType : "+accountType);
                    System.out.println("Balance is : "+balance);
                }
                public void getSavingAccountinformation(){
                    getAccountinformation();
                    getSavingAccountDetails(accountType,balance);
                }
}

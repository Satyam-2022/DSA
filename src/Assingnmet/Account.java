package Assingnmet;

public class Account {
              int accountNumber=3453;
              String accountName="Sam";

               void getAccountDetails(int accountNumber,String accountName){
                   System.out.println("AccountName : "+accountName);
                   System.out.println("AccountNumber : "+accountNumber);
              }
               void getAccountinformation(){
                  getAccountDetails(accountNumber,accountName);
              }

}

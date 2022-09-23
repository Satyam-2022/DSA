package Bank;

public class AccountDetails implements Runnable {

    Account account=new Account();

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            makeWithdrawal(500);
            if(account.getBalance()<=0){
                System.out.println("Account is overdrawn. . . .");
            }
        }
    }
    private synchronized void makeWithdrawal(int amt){
        if(account.getBalance()>=amt){
            System.out.println(Thread.currentThread().getName() + " is going to withdraw >=");
        }
        try {
            Thread.sleep(300);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        int bal=account.withdraw(amt);
        System.out.println(Thread.currentThread().getName() + "complete the withdrawal=> "+ bal);
    }
}

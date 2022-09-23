package Bank;

public class Account {

    private int Balance=5000;

    public int getBalance() {
        return Balance;
    }
    public int withdraw(int amount){
        Balance=Balance-amount;
        return Balance;
    }

}

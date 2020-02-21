package bperhaps.lecture6.practice;

public class Account {
    private final int MIN_BALANCE = 0;
    private final int MAX_BALANCE = 1000000;
    private int balance;

    public void setBalance(int balance) {
        if(MIN_BALANCE > balance || MAX_BALANCE < balance) return;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}

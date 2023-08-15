package Bank;

public interface Bank {
    void deposit(int accNo, double amt);
    void withdraw(int accNo, double amt);
    void  checkBalance(int accNo);
}

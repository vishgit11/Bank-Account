package Bank;


import java.util.ArrayList;
public class ICICIBank extends Customer implements Bank{
    
    ArrayList <Customer>customerInfo = MainApp1.customerInfo;
    
    boolean status;
    double bankBalance;

    public ICICIBank(String name, int accNo, double bankBalance) {
        super(name, accNo, bankBalance);
    }


    @Override
    public void deposit(int accNo, double amt) {
        for (Customer customer: customerInfo) {
            status = (customer.getAccNo() == accNo);
            bankBalance = customer.getBankBalance();
            if (status ) {
                bankBalance += amt;
                customer.setBankBalance(bankBalance);
                checkBalance(accNo);
            }
        }
    }


    @Override
    public void withdraw(int accNo, double amt) {
        for (Customer customer: customerInfo) {
            status = (customer.getAccNo() == accNo);
            bankBalance = customer.getBankBalance();
            if (status && amt < bankBalance) {
                bankBalance -= amt;
                customer.setBankBalance(bankBalance);
                checkBalance(accNo);
            }
            if (amt > bankBalance)
                throw new InsufficientBalance("Insufficient Balance");
        }
    }
    @Override
    public void checkBalance(int accNo) {
        for (Customer customer : customerInfo) {
            status = (customer.getAccNo() == accNo);
            bankBalance = customer.getBankBalance();
            if (status)
                System.out.println("------------------------------\n" +
                        "Bank Balance:" + bankBalance);
        }
    }
}

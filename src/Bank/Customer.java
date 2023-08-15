package Bank;

public class Customer {
    private String name;
    private int accNo;
    private double bankBalance;

    public Customer(String name, int accNo, double bankBalance) {
        this.name = name;
        this.accNo = accNo;
        this.bankBalance = bankBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
}

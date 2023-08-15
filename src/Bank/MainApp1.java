package Bank;

import java.util.Scanner;

import java.util.ArrayList;
public class MainApp1 {
    static Scanner sc = new Scanner(System.in);
    static ICICIBank bank;
    static ArrayList<Customer> customerInfo = new ArrayList<>();

    static {
        System.out.println("Enter the number of account to be added in the bank:");
        int noCstm = sc.nextInt();
        for (int i = 0; i < noCstm; i++) {
            System.out.println("Enter the Name of Customer:");
            String name = sc.next();

            System.out.println("Enter the Account No.:");
            int accNo = sc.nextInt();

            System.out.println("Enter the Bank Balance:");
            double bankBalance = sc.nextDouble();
            bank = new ICICIBank(name, accNo, bankBalance);
            System.out.println("----------------------------------------------------------------");

            customerInfo.add(bank);
        }
    }
    public static void main(String[] args) {
        boolean shouldContinue = true;

        do {
            System.out.println("MENU:\n" +
                    "1. Deposit Money\n" +
                    "2. Withdraw Money\n" +
                    "3. Display Bank Balance\n" +
                    "4. Exit");

            int opt = sc.nextInt();
            if (opt == 1)
            {
                System.out.println("Enter the Account No.:");
                int accNo = sc.nextInt();
                System.out.println("Enter the Deposit Amount:");
                double amt = sc.nextDouble();

                bank.deposit(accNo,amt);
            } else if (opt == 2) {
                System.out.println("Enter the Account No.:");
                int accNo = sc.nextInt();
                System.out.println("Enter the Withdraw Amount:");
                double amt = sc.nextDouble();

                bank.withdraw(accNo,amt);
            } else if (opt == 3) {
                System.out.println("Enter the Account No.:");
                int accNo = sc.nextInt();

                bank.checkBalance(accNo);
            } else if (opt == 4) {
                shouldContinue = false;
            } else
                System.out.println("Invalid Option !!");

        }while (shouldContinue);
    }
}

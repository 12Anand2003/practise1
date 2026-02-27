import java.util.*;

class Bank {

    int amount;
    String holderName;

    // Default Constructor
    public Bank() {
        
    }

    // Parameterized Constructor
    public Bank(String holderName, int amount) {
        this.holderName = holderName;
        this.amount = amount;
    }

    // Copy Constructor
    public Bank(Bank obj) {
        this.holderName = obj.holderName;
        this.amount = obj.amount;
    }

    // Deposit Method
    public void deposit(int d) {
        if (d > 0) {
            amount += d;
            System.out.println("Deposited: " + d);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw Method
    public void withdraw(int w) {
        if (w > 0 && w <= amount) {
            amount -= w;
            System.out.println("Withdrawn: " + w);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display Details
    public void display() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + amount);
    }
}

public class Banksystem {
    public static void main(String[] args) {

        Bank objb1 = new Bank("Anand", 5000);


        objb1.deposit(2000);
        objb1.withdraw(3000);
        objb1.display();

        // Copy Constructor
        Bank b2 = new Bank(objb1);
        b2.deposit(9000);
        b2.display();
    }
}
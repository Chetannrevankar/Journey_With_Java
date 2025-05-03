abstract class ATM {
    double balance = 0;

    abstract void withdraw(double amount);
    abstract void deposit(double amount);

    void checkBalance() {
        System.out.println("Current Balance: " + balance);      }}

class SBIATM extends ATM {
    void withdraw(double amount) {
        if (amount > 0 && amount + 5 <= balance) {
            balance -= (amount + 5.0);
            System.out.println("Withdrawn from SBI with 5rs charge. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount in SBI ATM.");   }}

    void deposit(double amount) {
        if (amount > 2) {
            balance += (amount - 2.0);
            System.out.println("Deposited to SBI with 2rs charge. Current Balance: " + balance);
        } else {
            System.out.println("Amount too low to deposit in SBI ATM.");        }}}

class HDFCATM extends ATM {
    void withdraw(double amount) {
        if (amount > 0 && amount + 10 <= balance) {
            balance -= (amount + 10.0);
            System.out.println("Withdrawn from HDFC with 10rs charge. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount in HDFC ATM.");      }}

    void deposit(double amount) {
        if (amount > 3) {
            balance += (amount - 3.0);
            System.out.println("Deposited to HDFC with 3rs charge. Current Balance: " + balance);
        } else {
            System.out.println("Amount too low to deposit in HDFC ATM.");       }}}

public class AbstractExample {
    public static void main(String args[]) {
        SBIATM sbiatm = new SBIATM();
        sbiatm.deposit(500);
        sbiatm.withdraw(100);
        sbiatm.checkBalance();

        System.out.println();

        HDFCATM hdfcatm = new HDFCATM();
        hdfcatm.deposit(300);
        hdfcatm.withdraw(100);
        hdfcatm.checkBalance();             }}

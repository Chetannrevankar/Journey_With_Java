abstract class ATM {
    abstract void withdraw();
    abstract void deposit();        }

class SBIATM extends ATM {
    void withdraw() {
        System.out.println("Withdrawing from SBI ATM...");      }

    void deposit() {
        System.out.println("Depositing to SBI ATM...");     }}

public class Abstraction {
    public static void main(String[] args) {
        SBIATM atm = new SBIATM();
        atm.deposit();
        atm.withdraw();     }}

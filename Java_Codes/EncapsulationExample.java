class BankAccount{
    private String accountHolderName;
    private int accountNumber;
    private double accountBalance;
    
    public String getaccountHolderName(){
        return accountHolderName;           }
    public int getaccountNumber(){
        return accountNumber;       }       
    public double getaccountBalance(){
        return accountBalance;          }
    public void setaccountHolderName(String a){
        accountHolderName = a;                   }
    public void setaccountNumber(int a){
        accountNumber = a;               }
    public void setaccountBalance(double a){
        if (a>=0){
        accountBalance = a;
        }else{
            System.out.println("Account Balance cannot be NEGATIVE");
        }}
    public void deposit(double amount){
        accountBalance += amount;
        System.out.println("Deposited: "+amount);
        System.out.println("Updated Balance: "+accountBalance);
    }
    public void withdraw(double amount){
        accountBalance -= amount;
        System.out.println("Withdraw: "+amount);
        System.out.println("Updated Balance: "+accountBalance);
    }
}
public class EncapsulationExample{
    public static void main(String args[]){
        BankAccount ba = new BankAccount();
        ba.setaccountHolderName("Chetan N Revankar");
        ba.setaccountNumber(123456789);
        ba.setaccountBalance(0.0123);
        System.out.println(ba.getaccountHolderName()+" : "+ba.getaccountNumber()+" : "+ba.getaccountBalance());
        System.out.println();
        ba.deposit(500);
        System.out.println();
        ba.withdraw(500);           }}
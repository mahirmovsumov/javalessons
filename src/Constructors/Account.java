package Constructors;

public class Account {

    //State= Fields
    private String Number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //Constructor
    public Account(){
        System.out.println("Emty constructor called");
    }

    public Account(String Number, double balance, String customerName,
                   String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor width parameters called");
        this.Number = Number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("7777",100.55,customerName,customerEmailAddress,customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    //behavior = methods
    public void deposit(double depositAmount){
        this.balance +=depositAmount;
        System.out.println("Deposit of " + depositAmount +
                " made. New balance is " + this.balance);
    }

    //behavior = methods
    public void withDraw(double withDrawalAmount){
        if (this.balance - withDrawalAmount<0){
            System.out.println("Only " + this.balance +
                    " available. Widthdrawal not processed");
        }else {
            this.balance -=withDrawalAmount;
            System.out.println("Widthdrawal of " + withDrawalAmount +
                    " proccesed. Remaining balance = " + this.balance);
        }
    }

    //getter
    public String getNumber() {
        return Number;
    }
    //setter
    public void setNumber(String number) {
        Number = number;
    }

    //getter
    public double getBalance() {
        return balance;
    }
    //setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //getter
    public String getCustomerName() {
        return customerName;
    }
    //setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    //getter
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
    //setter
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
    //getter
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    //setter
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

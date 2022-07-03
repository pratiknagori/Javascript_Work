public class BankAccount {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount () {
        //calling another constructor if an empty constructor is called
        this(12345, 0000, "Hello Bro", "default@gmail.com", 98190);
        System.out.println("Empty Constructor called");
    }

    //this helps to get all input in one line
    //this is called constructor overloading. format is <Access modifier> <name of Class> (parameters)
    public BankAccount (long accountNumber, long balance, String customerName, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount (String customerName, String email, long phoneNumber) {
        // calling the main constructor with all parametes and setting some default
        this(9999, 5555, customerName, email, phoneNumber);
    }

    //creating get methods for each field
    public long getAccountNumber () {
        return this.accountNumber;
    }

    public long getBalance () {
        return this.balance;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getEmail () {
        return this.email;
    }

    public long getPhoneNumber () {
        return this.phoneNumber;
    }

    //creating set methods for each field
    public void setAccountNumber (long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance (long balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Creating 2 Additional methods
    public void depositFunds (long addFunds) {
        this.balance += addFunds;
        System.out.println(addFunds + " added to your Account. Your current balance is " + this.balance);
    }

    public void withdrawFunds (long deleteFunds) {
        if (deleteFunds <= this.balance) {
            this.balance -= deleteFunds;
            System.out.println(deleteFunds + " withdrawn from your Account. Your current balance is " + this.balance);
        } else {
            System.out.println("Insufficient balance to be withdrawn");
        }

    }

}

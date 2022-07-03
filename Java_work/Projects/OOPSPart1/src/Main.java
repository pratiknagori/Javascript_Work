public class Main {
    public static void main(String[] args) {
        // what are objects
        // class is a template for creating objects

        //To use the Car template, we create objects (a new datatype based on the template Car).
        //below is called class initialization
        Car ferrari = new Car();
        Car indigo = new Car();

        ferrari.setModel("F8");
        System.out.println("Model is " + ferrari.getModel());
        ferrari.setModel("pratik");
        System.out.println("Model is " + ferrari.getModel());


        //this calls the constructor when a object is created
        BankAccount accountDetails = new BankAccount();

        //Setting all the details
        accountDetails.setAccountNumber(548752452);
        accountDetails.setBalance(0);
        accountDetails.setCustomerName("Pratik Nagori");
        accountDetails.setEmail("pratiknagori@gmail.com");
        accountDetails.setPhoneNumber(819088481);

        //Display all the details
        System.out.println("Account Number is " + accountDetails.getAccountNumber());
        System.out.println("Customer Name is " + accountDetails.getCustomerName());
        System.out.println("Customer email is " + accountDetails.getEmail());
        System.out.println("Customer phone number is " + accountDetails.getPhoneNumber());
        System.out.println("Balance in your account is " + accountDetails.getBalance());

        //Adding balance in the Account
        accountDetails.depositFunds(1000);

        //Withdraw balance in the Account
        accountDetails.withdrawFunds(1000);

        //Withdraw balance in the Account
        accountDetails.withdrawFunds(2000);


        //Calling the constructor, so as to set all the values in one go
        BankAccount accountDetailsConstructor = new BankAccount(548752455, 0, "Sergio Perez", "checo@gmail.com", 981908848 );
        System.out.println("Account Number is " + accountDetailsConstructor.getAccountNumber());
        System.out.println("Customer Name is " + accountDetailsConstructor.getCustomerName());
        System.out.println("Customer email is " + accountDetailsConstructor.getEmail());
        System.out.println("Customer phone number is " + accountDetailsConstructor.getPhoneNumber());
        System.out.println("Balance in your account is " + accountDetailsConstructor.getBalance());

        //Calling the other constructor
        BankAccount pratikAccount = new BankAccount ("Bitu", "b@gmail.com", 989898);
        System.out.println("Account Number is " + pratikAccount.getAccountNumber());
        System.out.println("Customer Name is " + pratikAccount.getCustomerName());
        System.out.println("Customer email is " + pratikAccount.getEmail());
        System.out.println("Customer phone number is " + pratikAccount.getPhoneNumber());
        System.out.println("Balance in your account is " + pratikAccount.getBalance());

    }
}
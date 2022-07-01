public class forStatement {
    public static double calculateInterest (double amount, double interestRate) {
        return(amount*(interestRate/100));
    }

    public static void forLoop () {
        //for(init, initialize once at start of loop; termination; increment) {}
        //the variable created in for loop is only for the loop and then it is destroyed. here "i"
        for(int i = 2; i < 5; i++) {
            System.out.println("Interest calculated with interest " + i + " is " + calculateInterest(10000.0, i));
        }
    }
}

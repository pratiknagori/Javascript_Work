public class Hello {

    public static void main (String[] args) {
        System.out.println("Hello World"); // this is a statement
        //this is called a code block
        System.out.println("Hello, Pratik");

        //variable declaration
      //  int myFirstNumber = (5 + 9) + (2 * 10);
        //printing the variable
       // System.out.println("The value I selected is " + myFirstNumber);
       // System.out.println(myFirstNumber);

        //expressions
        int myFirstNumber = (5 + 9) + (2 * 10);
        int mySecondNumber = (5 + 9) + (3 * 10);
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("The value I selected using expressions " + myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println("The value I selected using expressions " + myLastOne);

    }
}

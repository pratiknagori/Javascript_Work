public class Main {
    public static void main(String[] args) {

        int result = 1 + 2 ; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("1 + 2 = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("previous result " + previousResult);
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder of 4/3
        System.out.println("4 % 5 = " + result);

        //result = result + 1;
        result ++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        //result = result - 1;
        result --; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result/3
        result /= 3;
        System.out.println("Answer is = " + result);

        //result = result -3
        result -= 3;
        System.out.println("Answer is  = " + result);

        //if else command
        boolean isAlien = false; //assignment operator
        if (isAlien == false) {// no semi colon here, == is the comparison operator as if else is a complete single st.
            System.out.println("This is not an alien");
            System.out.println("I am nto scared of Aliens");
        }

        int topScore = 100;
        if (topScore != 100) {  //not equal to operators can be ==, !=, >, <, >=, <=
            System.out.println("You did not get the highest score");
        }

        // AND operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        //OR operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either of both condition are true");
        }

        //ternary operators
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double myFirstDoubleVar = 23.00d;
        double mySecondDoubleVar = 80.00d;
        double resultDouble = (myFirstDoubleVar + mySecondDoubleVar) * 100;
        double myRemainder = resultDouble % 40;
        System.out.println("The remainder is " + myRemainder);
        boolean isRemainderZero = (myRemainder == 0) ? true : false;
        System.out.println("The value of isRemainderZero is zero? " + isRemainderZero);
        if (isRemainderZero == false) {
            System.out.println("You have some remainder");
        }


    }
}
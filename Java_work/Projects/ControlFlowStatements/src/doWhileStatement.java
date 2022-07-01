public class doWhileStatement {
    public static void whileUse () {
        int count = 0;
        //the loop continues till the condition is false
        while (count!= 5) {
            System.out.println("Count value is " + count);
            count++;
        }
    }

    public static void doWhileUse () {
        int count = 0;
        //do while will always execute at least once
        do {
            System.out.println("Count value is " + count);
            count++;
        }
        while (count!= 5);
    }

    public static boolean isEvenNumber (int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkEven () {
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; //continue the loop, if the number is not an even number
            }
            System.out.println("The number is even and it is " + number);
        }
    }

}

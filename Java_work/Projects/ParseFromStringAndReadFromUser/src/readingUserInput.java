import java.util.Scanner;

public class readingUserInput {

    public static void readUserInput () {


        //scanner method is used to take inputs from user
        //creating an object of scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");

        //checks if the next number going to be input in nextInt is a number or not
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            //nextInt takes the input as int. Allows to read an integer from the console
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //to handle the next line character (enter key). After nextInt use this. Ese it will skip the next input from user
            System.out.println("You have entered Year " + yearOfBirth);

            System.out.println("Enter your name please ");
            //using the object scanner, to take input and store it in the string "name". nextLine method is used to take input
            String name = scanner.nextLine();
            System.out.println("Your name is " + name);

        } else {
            System.out.println("Invalid input provided for integer");
        }
        //release the memory taken up by the scanner object
        scanner.close();

        //Summary
        // 1 create the object of class Scanner
        //Ask for input using println
        // take input using nextLine and Store the input in a string
        //close scanner to release memory
    }

    public static void sumTenNumbers () {
        Scanner readNums = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while (i < 11) {
            System.out.println("Enter number " + i);
            boolean isValid = readNums.hasNextInt();
            if (isValid) {
                int n = readNums.nextInt();
                sum = sum + n;
                i++;
            } else {
                System.out.println("Invalid Number");
            }

            readNums.nextLine(); //handle end of line enter key
        }
        readNums.close();
        System.out.println("The sum of 10 numbers is " + sum);
    }

    public static void minAndMaxNumber () {
        Scanner scanner = new Scanner(System.in);

//        int min = 2147483647;
//        int max = -2147483647;
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter a number");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

//                if(first) {             // setting the number as min and max at first
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine(); // handle statement
        }
        System.out.println("Max number entered is " + max + " and the Min is " + min);
        scanner.close();
    }
}

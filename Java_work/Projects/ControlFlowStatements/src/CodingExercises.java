public class CodingExercises {
    public static void isCharThere () {
        char checkChar = 'A';

        switch(checkChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("You have selected char " + checkChar);
                break;
            default:
                System.out.println("No relevant char was found");
                break;
        }

    }

    public static void printDayOfTheWeek (int day) {

        switch(day) {
            case 0:
                System.out.println("It's Sunday");
                break;
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }
    //Coding Exercise 12
    public static void printNumberInWord (int number) {

        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

    }

    //Coding Exercise 13
    public static boolean isLeapyear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 !=0) {
            return true;
        } else if (year % 4 == 0 && year % 100 ==0 && year % 400 ==0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 4: case 6: case 9: case 11:
                return 30;
                case 2:
                    if(isLeapyear(year)) {
                        return 29;
                    }
                    else {
                        return 28;
                    }
                default:
                    return 31;
            }
        }

        }

    public static boolean isPrime (int n) {
        if (n ==1) {
            return false;
        }
        for(int i=2; i<= n/2; i++) { //for(int i=2; i<= Math.sqrt(n) i++), less number of loops
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;

    }

    public static void countPrime () {
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number is a prime number" + i);
                if (count ==3) {
                    System.out.println("COunt is reached");
                    break;
                }
            }
        }
    }

    public static void SumChallenge () {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum = sum + i;
                System.out.println("The number divisible by 3 and 5 is " + i);
                if (count==5) {
                    System.out.println("LImit is reached");
                    break;
                }

            }
        }
        System.out.println("SUm is " + sum);
    }

    public static boolean isOdd (int number) {
        if (number <= 0 ) {
            return false;
        } else if (number % 2 ==0) {
            return false;
        } else {
            return true;
        }
    }

    public static void sumOdd (int start, int end) {
        if (start < 0 || end < 0 || (start > end)) {
            System.out.println("Invalid input");
        } else {
            int sum =0;
            for (int i = start; i <= end; i+=1 ) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            System.out.println("The sum of odd numbers in the range is " + sum);
        }

    }

    public static int sumDigits (int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            //extracting the least significant digit
            int digit = number % 10;
            sum += digit;
            //dropping the least significant digit
            number /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome (int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }
        if (reverse == number) {
            return true;
        }
        return false;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }

    public static int evenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            number /= 10;
        }
        return sum;
    }


}

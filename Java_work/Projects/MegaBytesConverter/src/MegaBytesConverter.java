public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + "MB and " + remainingKilobytes + "KB");
        }

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (((hourOfDay < 8) && (hourOfDay >= 0) || (hourOfDay == 23)) && (barking == true)) {
            return true;
        } else {
            return false;
        }
    }

    // finding if a year is a leap year or not
    // public static boolean isLeapyear(int year) {
    //     if (year < 1 || year > 9999) {
    //         return false;
    //     } else if (year % 4 == 0 && year % 100 !=0) {
    //         return true;
    //     } else if (year % 4 == 0 && year % 100 ==0 && year % 400 ==0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    public static boolean isLeapYear(int year){

        if((year < 1 || year > 9999)) return false;

        return ((year % 4==0)&&(year %100!=0))||(year%400==0);

    }

    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {
        numOne = (int) (numOne * 1000);
        System.out.println(numOne);
        numTwo = (int) (numTwo * 1000);
        System.out.println(numTwo);
        if ( numOne == numTwo) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasEqualSum (int paramOne, int paramTwo, int paramThree) {
        if ((paramOne + paramTwo) == paramThree) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen (int numberOne, int numberTwo, int numberThree) {
        if ((numberOne >= 13 && numberOne <=19) || (numberTwo >= 13 && numberTwo <=19) || (numberThree >= 13 && numberThree <=19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int numberOne) {
        if (numberOne >= 13 && numberOne <=19) {
            return true;
        } else {
            return false;
        }
    }
}

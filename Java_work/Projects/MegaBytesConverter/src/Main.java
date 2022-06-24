public class Main {
    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        boolean isBarking = MegaBytesConverter.shouldWakeUp(true, 7);
        System.out.println(isBarking);
        boolean isItALeapYear = MegaBytesConverter.isLeapyear(2021);
        System.out.println(isItALeapYear);
        boolean isDoubleEqual = MegaBytesConverter.areEqualByThreeDecimalPlaces(3.147, 3.1476);
        System.out.println(isDoubleEqual);
        boolean isEqualSum = MegaBytesConverter.hasEqualSum(1, 1, 1);
        System.out.println(isEqualSum);
        boolean isNumberTeen = MegaBytesConverter.hasTeen(1, 15, 1);
        System.out.println(isNumberTeen);

    }
}

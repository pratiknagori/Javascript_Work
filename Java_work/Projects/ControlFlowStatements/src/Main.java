public class Main {
    public static void main(String[] args) {
        //Switch statement
        switchStatement.switchUse();

        //for statement
        System.out.println("Interest calculated is " + forStatement.calculateInterest(10000.0, 2.0));
        forStatement.forLoop();

        //while and do while
        doWhileStatement.whileUse();
        doWhileStatement.doWhileUse();
        doWhileStatement.checkEven();

        //Coding exercises;
        CodingExercises.isCharThere();
        CodingExercises.printDayOfTheWeek(2);
        CodingExercises.printNumberInWord(-1);
        System.out.println(CodingExercises.getDaysInMonth(3, 2020));

        System.out.println(CodingExercises.isPrime(5));
        CodingExercises.countPrime();
        CodingExercises.SumChallenge();
        System.out.println(CodingExercises.isOdd(17));
        CodingExercises.sumOdd(1, 3);
        CodingExercises.sumOdd(41, 3);
//        CodingExercises.sumOdd(1, 3);
//        CodingExercises.sumOdd(1, 10);
// Module 70
        System.out.println("Sum of digits is " + CodingExercises.sumDigits(125));
        //palindrome
        System.out.println("Is the given number palindrome " + CodingExercises.isPalindrome(12345));
        System.out.println("Sum of first and Last digits " + CodingExercises.sumFirstAndLastDigit(12345));
        System.out.println("Sum of even digits " + CodingExercises.evenDigitSum(12345));

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isNumber(5);
        isNumber(-5);
        isNumber(0);
    }
    public static void isNumber (int number) {
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }

}
public class Main {
    public static void main(String[] args) {
        int newScore = caclulateScore("Pratik", 500);
            System.out.println("New Score is " + newScore);
            caclulateScore(100);

        double inCms = calcFeetAndInchesToCentimeters(0, -5);
        System.out.println("The height is " + inCms);

        System.out.println("The height is " + calcFeetAndInchesToCentimeters (100));

    }
    public static int caclulateScore (String playerName, int score) {
        System.out.println("Player" + playerName + "score " + score);
        return  score * 1000;
    }
//this is called method overloading. Same method name but with different parameters
    public static int caclulateScore (int score) {
        System.out.println("Unamed player" + "score " + score);
        return  score * 10;
    }

    public static int caclulateScore () {
        System.out.println("No arguments provided");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)){

            double centimeters = feet * 12 * 2.54 ;
            centimeters += inches * 2.54;
            return centimeters;

        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0){
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println("Inches is equal to " + feet + "feet and inches " + remainingInches);
            return calcFeetAndInchesToCentimeters(feet, remainingInches);

        }
    }

}
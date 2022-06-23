public class Main {
    public static void main(String[] args) {
        //a a mile is equal to 1.609344 km
        double kilometres = 100 * 1.609344;
        int highScore = 50;
        highScore++;
        highScore--;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

//        if (score == 5000) {
//            System.out.println("Your score was 5000");
//        } else if (score > 6000) {
//            System.out.println("level is 5");
//
//        } else {
//            System.out.println("Bye bhau");
//        }
        //calling the method

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, levelCompleted, bonus);
        calculateScore(true, 800, 5, 15);

        int newHighScore = calculateNewScore(true, 800, 5, 15);
        System.out.println("New high score is" + newHighScore);

    }

    //declaring a new method with arguments
    //void means dont return anything to the calling method
    public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) { // same as if(gameOver == true)
            int finalScore = score + (levelCompleted * bonus); //variables created inside the code block, cannot be accessed outside
            System.out.println("Your final score is " + finalScore);
        }

    }

    //if you want to return a value to the calling method, use the datatype
    public static int calculateNewScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) { // same as if(gameOver == true)
            int finalScore = score + (levelCompleted * bonus);
            return finalScore ;
        } else {
            return -1; //-1 indicates invalid value
        }

    }
}
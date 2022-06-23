public class Main {
    public static void main(String[] args) {

        double sideA = 30.00d;
        double sideB = 30.00d;
        double sideC = 80.00d;

        if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)) {
            System.out.println("You have a valid triangle");
            if ((sideA == sideB) && (sideB == sideC)) {
                System.out.println("You have an Equilateral triangle");
            } else if ((sideA*sideA + sideB*sideB) == (sideC*sideC) || (sideB*sideB + sideC*sideC) == (sideA*sideA) || (sideA*sideA + sideC*sideC) == (sideB*sideB)) {
                System.out.println("You have a right angled triangle");
                
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                System.out.println("You have an isosceles triangle");

            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
public class PrimitiveDatatype {
    public static void main (String[] args) {

        byte myByteVal = 123;
        short myShortVal = 23234;
        int myIntVal = 123;
        long  myNewLongValue = (long) (50000 + 10*(myIntVal + myByteVal + myShortVal));
        System.out.println("The value of long is " + myNewLongValue);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum value of float is " + myMinFloatValue);
        System.out.println("Minimum value of float is " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum value of double is " + myMinDoubleValue);
        System.out.println("Minimum value of double is " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5.25f / 2; //java considers default decimal values as double
        double myDoubleValue = 5.25d / 2;
        System.out.println("value of float is " + myFloatValue);
        System.out.println("value of double is " + myDoubleValue);
        System.out.println("value of int is " + myIntValue); //decimal value is not computed for int datatype

        double inputPound = 5d;
        double outKilogram = inputPound * 0.45359237;
        System.out.println("Pound converted to Kilogram is " + outKilogram);
        double convertedKilos = 3_00_00.45_67_89; //this is also valid
        System.out.println(convertedKilos);

    }
}

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        //determine range of datatype
        //Integer is called as wrapper class, it gived gives us ways to perform operaitons on various primitive datatypes
        //Integer is the wrapper class for datatype int
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value of Integers is " + myMinIntValue);
        System.out.println("Integer Maximum Value of Integers is " + myMaxIntValue);
        //Below is called overflow/underflow As the addition results in negative number
        System.out.println("Busted Maximum Value of Integers is " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value of Integers is " + myMinByteValue);
        System.out.println("Byte Maximum Value of Integers is " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Byte Minimum Value of Integers is " + myMinShortValue);
        System.out.println("Byte Maximum Value of Integers is " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Byte Minimum Value of Integers is " + myMinLongValue);
        System.out.println("Byte Maximum Value of Integers is " + myMaxLongValue);
        long myLongValue = 100_1L;
        System.out.println("Byte Maximum Value of Integers is " + myLongValue);

        //casting
        int myTotal = (myMinIntValue/2);
        byte myNewByteVAlue = (byte) (myMinByteValue/2); //this is called casting, else java takes it as int by default
        short myNewShortValue = (short) (myMinShortValue/2);

    }
}
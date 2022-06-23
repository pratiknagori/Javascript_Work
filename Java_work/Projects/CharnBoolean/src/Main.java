public class Main {
    public static void main(String[] args) {

        char myChar = 'P';
        char myUnicodeChar = '\u0004'; //  indicates that u are using unicode cahracter
        System.out.println(myUnicodeChar);
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is Pratik";
        System.out.println("My string is equal to " + myString);
        myString = myString + " this is more";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 5;
        lastString = lastString + myInt;
        System.out.println("LAst string is equal to " + lastString);
    }
}
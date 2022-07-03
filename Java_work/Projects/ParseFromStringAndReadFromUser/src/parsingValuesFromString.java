public class parsingValuesFromString {

    //converting a string to another datatype
    public static void parseString () {
        String numberAsString = "2018";
        numberAsString += 1;
        System.out.println("numberAsString = " + numberAsString);

        //we are using a class called Integer, called as wrapper class of type Int. This method converts the string into Integer
        //if conversion fails, we will get error, NumberLangFormat exception. a string cannot be converted to int.
        //parse method is a static method to parse a string to an integer below

        numberAsString = "2019";

        int number = Integer.parseInt(numberAsString);
        System.out.println(number += 1);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println(doubleNumber += 1);
    }

}

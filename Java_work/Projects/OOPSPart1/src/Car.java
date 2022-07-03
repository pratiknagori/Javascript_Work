public class Car {

    //creating a variable as private, also called as fields
    //creating a template for class Car. STATE of the class car

    //private doesnt allow the variables to be accessed outside the class Car

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    //To use the above template, we create objects in Main class

    //setters and getters
    public void setModel (String model) {
        //The parameter "String model" is different from "private String model" defined above
        //to differentiate between them
        //this keyword allows you to access model field in this class defined above as private
        //inteli j shows you if you are updating a parameter
        String validModel = model.toLowerCase();
        //.equals method is used for String comparison
        if (validModel.equals("f8") || validModel.equals("plane")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }

    }

    public String getModel () {
        return this.model;
    }

}

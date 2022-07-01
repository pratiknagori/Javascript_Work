public class switchStatement {

    public static void switchUse () {
        int switchValue = 5;
        //switch statement
        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5: //defining multiple conditions in one line
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("None of the above"); //the default to eecute when no conditons meet
                break;
        }
    }

}

public class secondsAndMinutes {

    //this is called as constant, the value of INVALID_VALUE_MESSAGE cannot be changed. a static method can ONLY be called by a static method
    private static final String INVALID_VALUE_MESSAGE = "Ïnvalid value";
    public static String getDurationString (long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + " " + minutesString + " " + secondsString + "";
        }
    }

    public static String getDurationString (long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);

        }
    }
    public static double area (double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double circleArea = (radius * 3.14 * radius);
            return circleArea;

        }
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            double rectangleArea = (x * y);
            return rectangleArea;

        }
    }
}

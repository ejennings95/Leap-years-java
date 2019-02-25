public class LeapYears {

    public static String year(int a) {
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            return "It is a leap year";
        } else {
            return "It is not a leap year";
        }
    }
}


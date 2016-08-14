public class InchesToFeet {
    public static void main(String[] args) {
        final double inchesPerFeet = 12;
        double inchesNeeded = 86;

        double feetRequired = Math.floor(inchesNeeded / inchesPerFeet);
        double inchesRequired = inchesNeeded % inchesPerFeet;

        System.out.println(inchesNeeded + " inches is " + feetRequired + " feet and " + inchesRequired + " inches.");
    }
}



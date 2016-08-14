public class NauticalMiles {
    public static void main(String[] args) {

        final double kmPerNm = 1.852;
        final double milesPerNm = 1.150779;
        double nauticalMiles = 18;

        double resultKm = (nauticalMiles * kmPerNm);
        double resultMiles = (nauticalMiles * milesPerNm);


        System.out.println("In " + nauticalMiles + " nautical miles there are " + resultKm +
                " Kilometers and " + resultMiles + " miles");

    }

}
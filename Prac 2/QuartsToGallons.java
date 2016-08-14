public class QuartsToGallons {
    public static void main(String[] args) {

        final double quartsPerGallon = 4;
        double quartsNeeded = 18;

        double gallonsRequired = Math.floor(quartsNeeded / quartsPerGallon);
        double quartsRequired = quartsNeeded % quartsPerGallon;

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsRequired +
                " gallons plus " + quartsRequired + " quarts");

    }

}

import javax.swing.JOptionPane;

public class NauticalMilesInteractive {
    public static void main(String[] args) {

        String dialogueString;
        final double kmPerNm = 1.852;
        final double milesPerNm = 1.150779;
        double nauticalMiles;

        dialogueString = JOptionPane.showInputDialog(null, "Enter number of nautical miles", "NM",
                JOptionPane.INFORMATION_MESSAGE);

        nauticalMiles = Double.parseDouble(dialogueString);

        double resultKm = (nauticalMiles * kmPerNm);
        double resultMiles = (nauticalMiles * milesPerNm);


        JOptionPane.showMessageDialog(null, "In " + nauticalMiles + " nautical miles there are " + resultKm +
                " Kilometers and " + resultMiles + " miles");

    }

}
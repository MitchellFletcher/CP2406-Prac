import javax.swing.JOptionPane;

public class InchesToFeetInteractive {
    public static void main(String[] args) {

        String dialogueString;
        final double inchesPerFeet = 12;
        double inchesNeeded;

        dialogueString = JOptionPane.showInputDialog(null, "Enter number of inches needed", "inches",
                JOptionPane.INFORMATION_MESSAGE);

        inchesNeeded = Double.parseDouble(dialogueString);

        double feetRequired = Math.floor(inchesNeeded / inchesPerFeet);
        double inchesRequired = inchesNeeded % inchesPerFeet;

        JOptionPane.showMessageDialog(null, inchesNeeded + " inches is " + feetRequired + " feet and " + inchesRequired + " inches.");
    }
}


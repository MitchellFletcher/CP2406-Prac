import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        String dialogueString;
        final double quartsPerGallon = 4;
        double quartsNeeded;

        dialogueString = JOptionPane.showInputDialog(null, "Enter number of quarts needed", "quarts",
                JOptionPane.INFORMATION_MESSAGE);

        quartsNeeded = Double.parseDouble(dialogueString);

        double gallonsRequired = Math.floor(quartsNeeded / quartsPerGallon);
        double quartsRequired = quartsNeeded % quartsPerGallon;

        JOptionPane.showMessageDialog(null, "A job that needs " + quartsNeeded + " quarts requires " + gallonsRequired +
                " gallons plus " + quartsRequired + " quarts");

    }
}
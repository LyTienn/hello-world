

package Lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
        "Ly Cong Tien 20225934 - Do you want to change to the first class ticket ?", "Confirmation",
        JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null,
        "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}


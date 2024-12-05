
// Example 3: HelloNameDialog.java
package Lab01;
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result; // Khai báo biến result kiểu string
        result = JOptionPane.showInputDialog("Ly Cong Tien 20225934 - Please enter your name:"); //Nhập dữ liệu trên Dialog
        JOptionPane.showMessageDialog(null, "Hi " + result + " !"); // In ra thông báo 
        System.exit(0);
    }
}

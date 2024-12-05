
//Example 4: ShowTwoNumbers.java
package Lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1 , strNum2;
        String strNotification = "Ly Cong Tien 20225934 - You've just entered: ";
        
        strNum1 = JOptionPane.showInputDialog(null,
                "Ly Cong Tien 20225934 - Please input the first number: ","Ly Cong Tien 20225934 - Input the first number",
                JOptionPane.INFORMATION_MESSAGE); //Các string hiển thị trên dialog
        strNotification += strNum1 + " and "; //cập nhật strNotification
        
        strNum2 = JOptionPane.showInputDialog(null,
                "Ly Cong Tien 20225934 - Please input the second number: ","Ly Cong Tien 20225934 - Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        
        JOptionPane.showMessageDialog(null, strNotification,
                "Ly Cong Tien 20225934 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}


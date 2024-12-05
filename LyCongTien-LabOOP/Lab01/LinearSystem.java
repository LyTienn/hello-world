
//Example 2.2.6: Linear System
package Lab01;
import java.util.Scanner;
public class LinearSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ly Cong Tien 20225934");
        System.out.println("Nhap gia tri a11: ");
        double a11 = sc.nextDouble();
        System.out.println("Nhap gia tri a12: ");
        double a12 = sc.nextDouble();
        System.out.println("Nhap gia tri b1: ");
        double b1 = sc.nextDouble();
        System.out.println("Nhap gia tri a21: ");
        double a21 = sc.nextDouble();
        System.out.println("Nhap gia tri a22: ");
        double a22 = sc.nextDouble();
        System.out.println("Nhap gia tri b2: ");
        double b2 = sc.nextDouble();
        // Tính định thức D
        double D = a11 * a22 - a12 * a21;
        if(D != 0){
            //Tính Dx,Dy
            double Dx = b1 * a22 - b2 * a12;
            double Dy = b2 * a11 - b1 * a21;
            //Tính nghiệm
            double x1 = Dx / D;
            double x2 = Dy / D;
            System.out.println("Ly Cong Tien 20225934 - Nghiem cua he phuong trinh la: ");
            System.out.println("x1 = " + x1 + " and x2 = " + x2);
        }
        else{
            //Kiểm tra vô nghiệm hoặc vô số nghiệm
            if(b2 * a11 == b1 * a21 && b1 * a22 == b2 * a12){
                System.out.println("Ly Cong Tien 20225934 - He phuong trinh co vo so nghiem.");
            }
            else{
                System.out.println("Ly Cong Tien 20225934 - He phuong trinh vo nghiem.");
            }
        }
    }
}

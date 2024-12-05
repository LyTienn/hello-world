
//Example 2.2.6: Linear Equation
package Lab01;
import java.util.Scanner;
public class LinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ly Cong Tien 20225934 - Enter value a: ");
        double a = sc.nextDouble();
        System.out.println("Ly Cong Tien 20225934 - Enter value b: ");
        double b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            double x = (-b) / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
        sc.close();
    }
}

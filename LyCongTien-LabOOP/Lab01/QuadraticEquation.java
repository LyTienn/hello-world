
package Lab01;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ly Cong Tien 20225934");
        System.out.println("Enter value a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value b: ");
        double b = sc.nextDouble();
        System.out.println("Enter value c: ");
        double c = sc.nextDouble();
        double delta = b*b - 4*a*c;  //Tính delta
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Ly Cong Tien 20225934 - Phuong trinh co vo so nghiem.");
                }
                else{
                    System.out.println("Ly Cong Tien 20225934 - Phuong trinh vo nghiem.");
                }
            }
            else{
                System.out.println("Ly Cong Tien 20225934 - Phuong trinh co nghiem duy nhat: " + (-c) / b);
            }
        }
        else{
            if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Ly Cong Tien 20225934 - Cac nghiem cua phuong trinh la: ");
            System.out.println("x1: "+ x1 + " and x2: " + x2);
        }
        else if(delta == 0){
            double x = (-b) / (2*a);
            System.out.println("Ly Cong Tien 20225934 - Phuong trinh co nghiem kep: x = " + x);
        }
        else{
            double re = (-b) / (2*a);
            double im = Math.sqrt(-delta) / (2*a);
            System.out.println("Ly Cong Tien 20225934 - Phuong trinh co nghiem phuc: ");
            System.out.println("x1 = " + re + "+" + im + "i");
            System.out.println("x2 = " + re + "-" + im + "i");
            }
        }
        sc.close();
    }
}


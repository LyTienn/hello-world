
package Lab01;
import java.util.Scanner;
public class DayMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ly Cong Tien 20225934");
        int t,n;
        t = sc.nextInt();
        n = sc.nextInt();
        if(t >= 1 && t <= 12 && n > 0){
            if(t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12){
                System.out.println("Thang " + t + " nam " + n + " co 31 ngay." );
            }
            else if(t == 4 || t == 6 || t == 9 || t == 11){
                System.out.println("Thang " + t + " nam " + n + " co 30 ngay.");
            }
            else{
                if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)){
                    System.out.println("Thang 2 nam " + n + " co 29 ngay.");
            }
                else{
                    System.out.println("Thang 2 nam " + n + " co 28 ngay");
                }
            }
        }
        else{
            System.out.println("Thang hoac nam khong hop le, vui long nhap lai.");
        }
    }
}

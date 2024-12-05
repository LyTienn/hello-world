
package Lab01;
import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("Ly Cong Tien 20225934 - Enter value n: ");
        n = sc.nextInt();
        sc.close();
            int i,j;
            for(i = 0; i < n; i++){
                for(j = 0; j < n - 1 - i; j++){
                    System.out.print(" ");}
                for(int k = 1; k <= 2*i + 1; k++){
                    System.out.print("*");
                }
                System.out.println();
                }
            }
    }



//Example 5: Calculate 2 double numbers
package Lab01;
import java.util.Scanner;
public class Calculate2DoubleNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Khai báo biến input kiểu dữ liệu Scanner để đọc du lieu từ bàn phím
        System.out.println("Ly Cong Tien 20225934 - Nhap 2 so:");
        double num1 = input.nextDouble(); // Đọc số thực kiểu double từ đầu vào (bàn phím)
        double num2 = input.nextDouble();
        
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quot = num1 / num2;
        
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(quot);
        input.close();
    }
}


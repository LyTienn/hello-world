
package Lab01;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ly Cong Tien 20225934 - Nhap so phan tu cua mang: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Ly Cong Tien 20225934 - Nhap cac phan tu cua mang: ");
        for(int i = 0; i < size; i++){
            a[i] = sc.nextInt();
        }
        //Sắp xếp mảng tăng dần
        for(int i = 0; i < size - 1;i++){
            int pos = i;
            for(int j = i + 1; j < size; j++){
                if(a[j] < a[pos]){
                    pos = j;
                }
            }
            int tmp = a[i];
            a[i] = a[pos];
            a[pos] = tmp;
        }
        System.out.println("Ly Cong Tien 20225934 - Mang sau khi sap xep: ");
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //Tính tổng
        int sum = 0;
        for(int i = 0;i < size; i++){
            sum += a[i];
        }
        System.out.println("Ly Cong Tien 20225934 - Tong cac phan tu cua mang: " + sum);
        System.out.println("Ly Cong Tien 20225934 - Trung binh cong cac phan tu cua mang: " + (double)sum / size);
        sc.close();
    }
}

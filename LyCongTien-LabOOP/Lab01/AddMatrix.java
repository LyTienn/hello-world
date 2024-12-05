
package Lab01;
import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Nhập ma trận
        System.out.println("Ly Cong Tien 20225934 - Nhap so hang: ");
        int r = sc.nextInt();
        System.out.println("Ly Cong Tien 20225934 - Nhap so cot: ");
        int c = sc.nextInt();
        
        //Khai báo ma trận
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        int[][] SumMatrix = new int[r][c];
        
        //Nhập ma trận 1
        System.out.println("Ly Cong Tien 20225934 - Nhap ma tran 1: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        //Nhập ma trận 2
        System.out.println("Ly Cong Tien 20225934 - Nhap ma tran 2: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        //Tổng 2 ma trận
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                SumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Ly Cong Tien 20225934 - Tong 2 ma tran la: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(SumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

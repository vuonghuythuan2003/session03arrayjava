package array;

import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap so hang trong mot ma tran: \n");
        int rows = Integer.parseInt(src.nextLine());
        System.out.println("Nhap so cot trong mot ma tran: \n");
        int cols = Integer.parseInt(src.nextLine());
        int[][] matran = new int[rows][cols];

        System.out.println("Nhap cac gia tri trong ma tran: \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("matran[%d][%d]= ", i, j);
                matran[i][j] = Integer.parseInt(src.nextLine());
            }
        }

        System.out.println("\nIn ra ma tran la: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d\t", matran[i][j]);
            }
            System.out.println();
        }
        // Tim ra phan tu lon nhat
        int maxValue = matran[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matran[i][j] > maxValue) {
                    maxValue = matran[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }

        }
        System.out.println("Phan tu lon nhat trong mang la: "+ maxValue);
        System.out.println("Nam o vi tri trong mang la: "+ maxRow + "-" + maxCol);
    }
}

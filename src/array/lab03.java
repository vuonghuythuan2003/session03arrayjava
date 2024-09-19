package array;
import java.util.Scanner;
public class lab03 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang 1: \n");
        int n1 = Integer.parseInt(src.nextLine());
        int[] array1 = new int[n1];
        System.out.println("Nhap vao cac gia tri trong mang 1: \n");
        for(int i = 0; i < array1.length; i++) {
            System.out.printf("array1[%d]=", i);
            array1[i] = Integer.parseInt(src.nextLine());
        }
        System.out.println("In ra cac gia tri trong mang la: \n");
        for(int i = 0; i < array1.length; i++) {
            System.out.printf("array1[%d] = %d \t", i, array1[i]);
        }
        System.out.println("\n");
        System.out.println("Nhap vao so phan tu cua mang 2: \n");
        int n2 = Integer.parseInt(src.nextLine());
        int[] array2 = new int[n2];
        System.out.println("Nhap vao cac gia tri trong mang 2: \n");
        for(int i = 0; i < array2.length; i++) {
            System.out.printf("array2[%d]=", i);
            array2[i] = Integer.parseInt(src.nextLine());
        }
        System.out.println("In ra cac gia tri trong mang la: \n");
        for(int i = 0; i < array2.length; i++) {
            System.out.printf("array2[%d] = %d \t ", i, array2[i]);
        }
        System.out.println("Tong cac phan tu trong mang 1 va mang 2: ");
        int[] array3 = new int[n1 + n2];
        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++) {
            array3[n1 + i] = array2[i];
        }
        System.out.println("In ra cac gia tri trong mang 3 la: \n");
        for(int i = 0; i < array3.length; i++) {
            System.out.printf("array3[%d] = %d \t ", i, array3[i]);
        }
        System.out.println("\n");
    }
}

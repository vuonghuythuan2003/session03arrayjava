package array;
import java.util.Scanner;
public class lab05 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang la: ");
        int n  = Integer.parseInt(src.nextLine());
        int[] array = new int[n];
        System.out.println("Nhap vao cac gia tri cua mang: ");
        for(int i = 0; i < array.length; i++) {
            System.out.printf("Array[%d] = \n", i);
            array[i] = Integer.parseInt(src.nextLine());
        }
        System.out.println("In ra cac phan tu trong mang: ");
        for(int i = 0; i < array.length; i++) {
            System.out.printf("Array[%d] = %d \n", i, array[i] );
        }
        System.out.println("Phan tu co gia tri nho nhat trong mang");
        int minArray = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minArray) {
                minArray = array[i];
            }
        }
        System.out.println(minArray);
    }
}

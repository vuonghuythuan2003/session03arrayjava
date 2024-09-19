package array;
import java.util.Scanner;
public class lab02 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng là: \n");
        int n = Integer.parseInt(src.nextLine());
        int[] oldArray = new int[n];
        System.out.println("Nhap cac gia tri cua mang truoc khi thêm phần tử là: \n");
        for(int i = 0; i <oldArray.length; i++) {
            System.out.printf("oldArray[%d]= ", i);
            oldArray[i] = Integer.parseInt(src.nextLine());
        }
        System.out.println("In ra cac gia tri cua mang truoc khi them vao mang: \n");
        for(int i = 0; i <oldArray.length; i++) {
            System.out.printf("oldArray[%d]= %d \n", i, oldArray[i]);
        }
        System.out.println("Nhap mot gia tri can chen vao mang la: \n");
        int X = Integer.parseInt(src.nextLine());
        System.out.println("Nhap vao mot vi tri index de chen vao mang la: \n");
        int indexValue = Integer.parseInt(src.nextLine());
        int[] arrayNew = new int[oldArray.length + 1];
        // Coopy cac phan tu moi duoc them vao mang moi
        for(int i = 0; i < arrayNew.length; i++) {
            if(i < indexValue) {
                arrayNew[i] = oldArray[i];
            }else if
                (i == indexValue) {
                    arrayNew[i] = X;
                }
            else{
                arrayNew[i] = oldArray[i - 1];
            }
        }
        System.out.println("Gia tri cac phan tu sau khi them moi la : \n");
        for(int i = 0; i <arrayNew.length; i++) {
            System.out.printf("%d \t" ,arrayNew[i]);
        }
        System.out.println("\n");
    }
}

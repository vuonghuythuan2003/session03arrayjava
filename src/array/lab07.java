package array;
import java.util.Scanner;
public class lab07 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao chuoi chinh: ");
        String str1 = src.nextLine();
        System.out.println("Nhap vao chuoi con: ");
        String str2 = src.nextLine();
        boolean result = str1.contains(str2);
        if (result) {
            System.out.println("Chuoi chinh chua chuoi con");
        } else {
            System.out.println("Chuoi chinh khong chua chuoi con");
        }
    }
}

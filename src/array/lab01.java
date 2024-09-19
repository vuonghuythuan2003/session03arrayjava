package array;

import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = Integer.parseInt(src.nextLine());
        int[] numbers = new int[n];
        System.out.println("\nVui lòng nhập các phần tử của mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("number[%d]= ", i);
            numbers[i] = Integer.parseInt(src.nextLine());
        }
        System.out.println("\nIn ra cac phan tu cua mang truoc khi xoa la: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("\n numbers[%d] = %d", i, numbers[i]);
        }

        System.out.println("\nVui long nhap mot so nguyen bat ky de xoa : ");
        int deleteNumbers = Integer.parseInt(src.nextLine());
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == deleteNumbers) {
                count++;
            }
        }
        //Khoi tao mang moi NumberNew  voi so phan tu numbers -count
        int[] numbersNew = new int[numbers.length - count];
        // coppy cac phan tu khong bi xoa tu numbers sang numbersNew
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            // Nếu phần tử này bằng giá trị cần xóa thì continue và không cần sao chép
            if (numbers[i] == deleteNumbers) {
                continue;
            } else {
                numbersNew[index] = numbers[i];
                index++;
            }
        }
        System.out.println("\nMang sau khi phan tu sau khi bi xoa la : ");
        for (int i = 0; i < numbersNew.length; i++) {
            System.out.printf("number[%d]= %d\t", i, numbersNew[i]);
        }
    }
}

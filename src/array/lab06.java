package array;

import java.util.Scanner;

public class lab06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ nhất: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi thứ hai: ");
        String str2 = sc.nextLine();
        System.out.println("Kết quả của phép nối chuỗi: ");
        String str3 = str1.concat(str2);
        System.out.println(str3);
    }
}

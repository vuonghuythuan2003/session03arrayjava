package array;

import java.util.Scanner;
import java.util.regex.Pattern;

public class lab09 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Nhập địa chỉ email:");
        String email = src.nextLine();

        System.out.println("Nhập mật khẩu:");
        String password = src.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Email hợp lệ.");
        } else {
            System.out.println("Email khan hợp lệ.");
        }

        if (isValidPassword(password)) {
            System.out.println("Mật khẩu hợp lệ.");
        } else {
            System.out.println("Mật khẩu không hợp lệ.");
        }
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    public static boolean isValidPassword(String password) {
        String passwordRegex = "^(?!.*\\s).{7,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        return pattern.matcher(password).matches();
    }
}

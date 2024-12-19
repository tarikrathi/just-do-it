import java.util.Scanner;
import java.util.Random;

public class rendompassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$_()";

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Invalid length!");
        } else {
            StringBuilder password = new StringBuilder();
            for (int i = 0; i < length; i++) {
                password.append(alphabet.charAt(random.nextInt(alphabet.length())));
            }
            System.out.println("Generated Password: " + password);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число больше 7");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 7) {
            System.out.println("Привет");
        }
    }
}

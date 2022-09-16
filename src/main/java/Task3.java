import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов в массиве");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        System.out.println("Введите каждый элеммент массива");

        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Числа кратные трем");
        for (int i : arr) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

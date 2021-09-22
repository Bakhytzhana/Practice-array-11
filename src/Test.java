import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число больше 3:");
        int n = 0;
        Scanner scan = new Scanner(System.in);

        while (n <= 3) {
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n <= 3) {
                    System.out.println("Ошибка ввода. Число должно быть больше 3. Повторите еще раз.");
                }
            } else {
                System.out.println("Ошибка ввода.");
                scan.next();
            }
        }
        System.out.println("Вы ввели число: " + n);

        int[] a = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * n + 1);
            if (a[i] % 2 == 0) {
                x++;
            }
        }
        System.out.println(Arrays.toString(a));

        int[] b = new int[x];
        x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[x] = a[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}

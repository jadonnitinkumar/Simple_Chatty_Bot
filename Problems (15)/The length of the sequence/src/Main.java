import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num != 0) {
            num = scanner.nextInt();
            count++;
        }
        System.out.println(count);
    }
}
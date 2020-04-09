import java.util.Scanner;
import static java.lang.System.in;

class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(in);
        int n = sc1.nextInt();
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (count < n) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
    }
}
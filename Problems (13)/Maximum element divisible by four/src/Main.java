import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int maxNum = 0;
        for (int i = 0; i < num; i++) {
            int x = scanner.nextInt();
            if (x % 4 == 0) {
                maxNum = x > maxNum ? x : maxNum;
            }
        }
        System.out.println(maxNum);
    }
}

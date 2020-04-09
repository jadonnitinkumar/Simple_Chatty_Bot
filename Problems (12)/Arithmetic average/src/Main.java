import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int counter = 0;
        double totalSum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                totalSum += i;
                counter++;
            }
        }
        System.out.println(totalSum / counter);
    }
}
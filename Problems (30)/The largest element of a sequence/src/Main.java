import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int largest = 0;

        while ((n = scanner.nextInt()) != 0) {
            if (n > largest) {
                largest = n;
            }
        }
        System.out.print(largest);

    }
}
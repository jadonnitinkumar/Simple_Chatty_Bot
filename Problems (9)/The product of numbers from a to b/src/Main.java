import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long product = 1; //For testcase 2, product gets too big for type 'int'
        for (int i = a; i < b; i++) {
            product = product * i; // or product *= i;
        }
        System.out.println(product);

    }
}
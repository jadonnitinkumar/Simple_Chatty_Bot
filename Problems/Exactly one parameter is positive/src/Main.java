import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean a = scanner.nextInt() > 0;
        boolean b = scanner.nextInt() > 0;
        boolean c = scanner.nextInt() > 0;

        System.out.println((a && !b && !c) || (!a && b && !c) || (!a && !b && c));

        scanner.close();
    }
}
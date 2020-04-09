import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int sum = 0;
        while ( i != 0 ){
            i = scanner.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }
}
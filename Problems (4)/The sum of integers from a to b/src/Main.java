import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for(int i=a ; i<=b ; i++){
            c = c+i;
        }
        System.out.println(c);
    }
}
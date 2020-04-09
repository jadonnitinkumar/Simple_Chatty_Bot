import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = 0;
        for (int i=1 ; i<=a ; i++){
            c=i*i;
            if(c<=a){
                System.out.println(c);
            }
        }
    }
}
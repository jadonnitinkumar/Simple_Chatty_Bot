import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c=0;
        for(int i=1 ;i<=a ;i++){
            int num = sc.nextInt();
            if(num%6==0){
                c=c+num;
            }
        }
        System.out.println(c);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c=0 ,d=0 , e=0;
        for(int i = 1 ; i<=a ; i++){
            int n=sc.nextInt();
            if(n==0){
                c=c+1;
            }else if(n==1){
                d=d+1;
            }else if(n==-1){
                e=e+1;
            }
        }
        System.out.print(c+" ");
        System.out.print(d+" ");
        System.out.print(e);
    }
}
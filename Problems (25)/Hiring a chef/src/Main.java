//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        String education = sc.next();
        int years = sc.nextInt();
        String cuisine = sc.next();

        System.out.println( "The form for " +name+" is completed. We will contact you if we need a chef that cooks " +cuisine+" dishes."

        );
    }
}
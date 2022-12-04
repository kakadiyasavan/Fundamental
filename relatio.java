import java.util.Scanner;

public class relatio {

    public static void main(String[] args) {

        int a;
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        a = sk.nextInt();

        int b;
        Scanner pk = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        b = pk.nextInt();

        int c;
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        c = sy.nextInt();

        if (a > b) {
            System.out.println("A is Big : " + a);
        } else if (b > c) {
            System.out.println("B is Big : " + a);
        } else if (c > a) {
            System.out.println("C is Big : " + a);
        } else if (a > b) {
            System.out.println("A is Big : " + a);
        }

    }

}

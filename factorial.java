import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        int a = 1;
        int b;
        Scanner kk  = new Scanner(System.in);
        System.out.println("Enter the value : 8");
        b=kk.nextInt();

        for (int i = 1; i <= b; i++) {
            a =a*i;
        }
        System.out.println("Number : "+b+" is : "+a);
    }

}

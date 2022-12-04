import java.util.Scanner;

public class small {

    public static void main(String[] args) {
    
        int a ;
        Scanner ze = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        a = ze.nextInt();

        int b ;
        Scanner pe = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        b = pe.nextInt();

        int c ;
        Scanner ce = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        c = ce.nextInt();

        if(a<b){
            System.out.println("A is Small : "+a);
        }
        else if(b<c){
            System.out.println("B is Small : "+a);
        }
        else if(c<a){
            System.out.println("C is Small : "+a);
        }
       else if(a<b){
            System.out.println("A is Small : "+a);
        }

    }
}

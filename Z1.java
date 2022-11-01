import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        divide(b, c);
    }

    public static void divide(int a, int n) {

        int f = 0;
        for (int k = 0; a >= 0; k++ ) {
            a = a - n;
            f = k;

        }
        System.out.println(f);
    }

}
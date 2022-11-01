import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            System.out.println(p(name, name.length()));
        }
    }
    public static boolean p(String name, int n) {
        int k = 0;
        while (k < n/2) {
            if (name.charAt(k) != name.charAt(n - 1 - k)) {
                return false;
            }
            k++;
        }
        return true;
    }

}
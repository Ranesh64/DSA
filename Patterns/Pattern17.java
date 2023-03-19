package Patterns;

public class Pattern17 {
    void printTriangle(int n) {
        // code here
        char s;
        for (int i = 1; i <= n; i++) {
            s = 'A';
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(s++);
            }
            s -= 2;
            for (int l = 0; l < i - 1; l++) {
                System.out.print(s--);
            }
            System.out.println();
        }
    }
}

package Patterns;

public class Pattern14 {
    void printTriangle(int n) {
        // code here
        char s;
        for (int i = 1; i <= n; i++) {
            s = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(s++);
            }
            System.out.println();
        }
    }
}

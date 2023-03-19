package Patterns;

public class Pattern16 {
    void printTriangle(int n) {
        // code here
        char s = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s);
            }
            s++;
            System.out.println();
        }
    }
}

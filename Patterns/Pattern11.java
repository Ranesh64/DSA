package Patterns;

public class Pattern11 {
    void printTriangle(int n) {
        // code here
        int a;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                a = 1;
            } else {
                a = 0;
            }

            for (int j = 0; j < i; j++) {
                System.out.print(a + " ");
                a ^= 1;
            }
            System.out.println();
        }
    }
}

package Patterns;

public class Pattern10 {
    void printTriangle(int n) {
        // code here
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {

                for (int j = n - 1; j >= 1; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

package Patterns;

public class Pattern21 {
    void printSquare(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

package Patterns;

public class Pattern04 {
    static void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
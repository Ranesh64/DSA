public class Pattern22 {
    void printSquare(int n) {
        // code here
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((i + 1) + " ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

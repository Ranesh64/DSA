public class Pattern15 {
    void printTriangle(int n) {
        // code here
        char s;
        for (int i = n; i > 0; i--) {
            s = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(s++);
            }
            System.out.println();
        }
    }
}

public class Pattern18 {
    void printTriangle(int n) {
        // code here
        char s = 'A';
        s += n - 1;
        char temp;
        for (int i = 1; i <= n; i++) {
            temp = s;
            for (int j = 0; j < i; j++) {
                System.out.print(temp-- + " ");
            }
            System.out.println();

        }
    }
}

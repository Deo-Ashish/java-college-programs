public class pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // for first triangle
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" " + j);
            }

            // for spaces
            for (int s = 1; s <= i; s++) {
                if (s != 1) {
                    System.out.print("    ");
                }

            }

            // for second triangle
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(" " + j);
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // for first triangle
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" " + j);
            }

            // for spaces
            for (int s = 1; s <= i; s++) {
                if (s != 1) {
                    System.out.print("    ");
                }

            }

            // for second triangle
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(" " + j);
            }

            System.out.println();
        }
    }
}

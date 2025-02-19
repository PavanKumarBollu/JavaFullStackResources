public class PatternGenerator {

    // Square Hollow Pattern
    public static void squareHollowPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Number Triangular Pattern
    public static void numberTriangularPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Number Increasing Pyramid
    public static void numberIncreasingPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Number Increasing Reverse Pyramid
    public static void numberIncreasingReversePyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Number Changing Pyramid
    public static void numberChangingPyramid(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    // Zero-One Triangle
    public static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }

    // Palindrome Triangular
    public static void palindromeTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Rhombus Pattern
    public static void rhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Diamond Pattern
    public static void diamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Butterfly Star Pattern
    public static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Add the remaining patterns similarly...

    public static void main(String[] args) {
        int n = 5; // Change this value for different sizes

		System.out.println("Square pattern");
        squareHollowPattern(n);
		System.out.println("TrianglePattern");
        numberTriangularPattern(n);
		System.out.println("Increasing Pattern");
        numberIncreasingPyramid(n);
		System.out.println("Reversed Increasing");
        numberIncreasingReversePyramid(n);
		System.out.println("Number Chaining");
        numberChangingPyramid(n);
		System.out.println("Zero one Triangle");
        zeroOneTriangle(n);
		System.out.println("Palindrome ");
        palindromeTriangle(n);
		System.out.println("rhombusPattern");
        rhombusPattern(n);
		System.out.println("Diamond Pattern");
        diamondPattern(n);
		System.out.println("Butterfly");
        butterflyPattern(n);

    }
}

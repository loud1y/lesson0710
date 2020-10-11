public class lesson0710 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.printf("Куз" + "басс" + "\n");
            } else if (i % 5 == 0) {
                System.out.printf("басс" + "\n");
            } else if (i % 3 == 0) {
                System.out.printf("Куз" + "\n");
            } else {
                System.out.printf("%d" + "\n", i);
            }
        }
    }
}
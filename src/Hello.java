import java.sql.SQLOutput;

public class Hello {

    static void main() {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 6, i, 6 * i).println();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 7, i, 7 * i).println();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //square of the first 10 numbers
        for (int i = 1; i <= 10; i++) {
            System.out.println("square-" + i*i);
        }
    }
}

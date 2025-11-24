public class printTwice {
    static void main() {
        System.out.println("Hello World");
        System.out.println("Hello World");

        sayHelloWord();
        sum(23,34);
        thirdAngle(30, 50);
    }

    static void sayHelloWord() {
        System.out.println("Hello World");
        System.out.println("Hello World");

    }

    static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }

    static void thirdAngle(int firstAngle, int secondAngle) {
        int sumOfAngleInATriangle = 180;
        int thirdAngle = sumOfAngleInATriangle - firstAngle - secondAngle;
        System.out.println(thirdAngle);

    }

}

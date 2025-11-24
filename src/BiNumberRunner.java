public class BiNumberRunner {
    static void main() {
        BiNumber numbers = new BiNumber(2, 3);

        System.out.println(numbers.mutiply());
        System.out.println(numbers.add());
        numbers.doubleValue();
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());
    }
}

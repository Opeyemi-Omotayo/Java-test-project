import java.math.BigDecimal;
import java.math.MathContext;

public class BigDec {


    static void main() {
        BigDecimal number1 = new BigDecimal("65.555666");
        BigDecimal number2 = new BigDecimal("34.555666");

        //add
        BigDecimal sum = number1.add(number2);
        System.out.println(sum);

        //add with int
        int i = 2;
        System.out.println(number1.add(new BigDecimal(i)));

        //subtraction
        System.out.println(number1.subtract(number2));

        //multiplication
        System.out.println(number1.multiply(number2));

        //Division
        // Set precision to 5
        MathContext mc = new MathContext(5);
        System.out.println(number1.divide(number2, mc));
    }

}

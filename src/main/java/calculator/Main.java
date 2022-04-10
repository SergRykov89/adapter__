package calculator;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(10, 25));
        System.out.println(calc.mult(25, 95));
        System.out.println(calc.pow(58, 36));
    }
}

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;

public class Algorithm1 {
    public static double expt(double b, int n) {
        if (n == 0) return 1;
        return b * expt(b, n - 1);
    }

    public static double exptCycle(double b, int n) {
        if (n == 0) return 1;
        double result = 1;
        for (; n > 0; n--) {
            result = result * b;
        }
        return result;
    }

    public static void test1() throws InterruptedException {
        long t1 = System.nanoTime();
        System.out.println("Результат первого " + expt(10, 5));
        long t2 = System.nanoTime();
        System.out.println("Время выполнения первого " + (t2 - t1));
        System.out.println("Результат второго " + expt(10, 9));
        long t3 = System.nanoTime();
        System.out.println("Время выполнения второго " + (t3 - t2));
    }

    public static void test2() throws InterruptedException {
        long t1 = System.nanoTime();
        System.out.println("Результат первого " + exptCycle(10, 5));
        long t2 = System.nanoTime();
        System.out.println("Время выполнения первого " + (t2 - t1));
        System.out.println("Результат второго " + exptCycle(10, 9));
        long t3 = System.nanoTime();
        System.out.println("Время выполнения второго " + (t3 - t2));
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Выполнение рекурсии ");
        test1();
        System.out.println("Выполнение цикла");
        test2();
    }
}

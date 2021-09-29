import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;

public class Algorithm1 {
    public static double expt(double b, int n) throws InterruptedException {
        Thread.sleep(1);
        if (n == 0) return 1;
        return b * expt(b, n - 1);
    }

    public static double exptCycle(double b, int n) throws InterruptedException {
        Thread.sleep(1);
        if (n == 0) return 1;
        double result = 1;
        for (; n > 0; n--) {
            result = result * b;
        }
        return result;
    }

    public static void test1() throws InterruptedException {
        Clock clock = Clock.systemDefaultZone();
        Instant instant = clock.instant();
        long start = instant.getNano();
        System.out.println("Результат первого " + expt(5, 10));
        Clock clock2 = Clock.systemDefaultZone();
        Instant instant2 = clock2.instant();
        long intermediate = instant2.getNano();
        System.out.println("Время выполнения первого в наносекундах " + (intermediate - start));
        System.out.println("Результат второго " + expt(2, 11));
        Clock clock3 = Clock.systemDefaultZone();
        Instant instant3 = clock3.instant();
        long end = instant3.getNano();
        System.out.println("Время выполнения второго в наносекундах " + (end - intermediate));
    }

    public static void test2() throws InterruptedException {
        Clock clock = Clock.systemDefaultZone();
        Instant instant = clock.instant();
        long start = instant.getNano();
        System.out.println("Результат первого " + exptCycle(5, 10));
        Clock clock2 = Clock.systemDefaultZone();
        Instant instant2 = clock2.instant();
        long intermediate = instant2.getNano();
        System.out.println("Время выполнения первого в наносекундах " + (intermediate - start));
        System.out.println("Результат второго " + exptCycle(2, 11));
        Clock clock3 = Clock.systemDefaultZone();
        Instant instant3 = clock3.instant();
        long end = instant3.getNano();
        System.out.println("Время выполнения второго в наносекундах " + (end - intermediate));
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Выполнение рекурсии ");
        test1();
        System.out.println("Выполнение цикла");
        test2();
    }
}

public class Algorithm2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Выполнение цикла ");
        test1();
        System.out.println("Выполнение рекурсии");
        test2();
    }

    public static void test1() throws InterruptedException {
        long t1 = System.nanoTime();
        System.out.println("Результат первого " + countNumber(1, 3));
        long t2 = System.nanoTime();
        System.out.println("Время выполнения первого " + (t2 - t1));
        System.out.println("Результат второго " + countNumber(3, 4));
        long t3 = System.nanoTime();
        System.out.println("Время выполнения второго " + (t3 - t2));
    }

    public static void test2() throws InterruptedException {
        long t1 = System.nanoTime();
        System.out.println("Результат первого " + countNumberRec(1, 3));
        long t2 = System.nanoTime();
        System.out.println("Время выполнения первого " + (t2 - t1));
        System.out.println("Результат второго " + countNumberRec(3, 4));
        long t3 = System.nanoTime();
        System.out.println("Время выполнения второго " + (t3 - t2));
    }

    public static double countNumber(double b, int n) {
        double h = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                b = Math.pow(Math.pow(b, n / 2), 2);
            } else {
                b = b * Math.pow(b, n);
            }
            n--;
            h += b;

        }
        return h;
    }

    public static double countNumberRec(double b, int n) {
        if (n == 0) return 0;
        if (n % 2 == 0) {
            b = Math.pow(Math.pow(b, n / 2), 2);
        } else {
            b = b * Math.pow(b, n);
        }
        return b += countNumberRec(b, n - 1);
    }

}

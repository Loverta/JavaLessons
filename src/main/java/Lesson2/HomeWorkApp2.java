package Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(trueOrFalse(5, 10));
        print(0);
        System.out.println(trueOrFalse(0));
        cycle("assd", 5);
        System.out.println(year(1653));
    }

    public static boolean trueOrFalse(int a, int b) {
        int sum = a + b;
        if ((sum >= 10) && (sum <= 20)) return true;
        else return false;
    }

    public static void print(int a) {
        if (a < 0) System.out.println("Отрицательное");
        else System.out.println("Положительное");
    }

    public static boolean trueOrFalse(int a) {
        if (a < 0) return true;
        else return false;
    }

    public static void cycle(String a, int b) {
        for (;b > 0;b--) System.out.print(a + " ");
        System.out.println();
    }

    /**
     * метод, ищущий високосный год.
     * @param a - сам год.
     * @return если ниодно условие не выполняется, выводится false.
     */
    public static boolean year(int a) {                     // не до конца уверен, что решено верно.

        if (a < 0) return false;

        if (a % 400 == 0)  return true;

        a %= 1000;

        switch (a) {
            case 0: return false;
            case 100: return false;
            case 200: return false;
            case 300: return false;
            case 500: return false;
            case 600: return false;
            case 700: return false;
            case 900: return false;
        }

        if (a % 4 == 0) return true;

        return false;
    }

}


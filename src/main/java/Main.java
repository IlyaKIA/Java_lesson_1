public class Main {
    public static void main(String[] args) {
        byte miniNumber = 100;
        short mediumNumber = 30000;
        int justNumber = -100000;
        long bigNumber = -50000000;

        float pi = 3.14f;
        double newPi = 3.14;

        String massageHallo = "Привет всем!";
        char symbol = '\u042b';

        boolean areYouHome = true;

        // Задание 3
        float a = 5.5f, b = 10f, c = 1.5f, d = 0.5f;
        System.out.print("Задание 3. Результат метода: ");
        System.out.println(getFormulaResult(a, b, c, d));

        //Задание 4
        int x = 5, y = 7;
        System.out.print("Задание 4. Сумма в пределах от 10 до 20 включительно: ");
        System.out.println(checkTheSumma(x, y));

        // Задание 5
        int positiveNum = -5;
        System.out.print("Задание 5. Проверка числа: ");
        checkPositiveNumber(positiveNum);

        // Задание 6
        System.out.print("Задание 6. Число меньше нуля: ");
        System.out.println(checkPositiveNumberBool(positiveNum));

        //Задание 7
        String name = "Илья";
        System.out.print("Задание 7.: ");
        halloName(name);

        //Задание 8*
        int year = 2020;
        System.out.print("Задание 8*. Это был тяжелый год: ");
        leapYear(year);

    }

    public static float getFormulaResult(float a, float b, float c,float d) {
        return a * (b + (c / d));
    }

    public static boolean checkTheSumma(int x, int y) {
        int z = x + y;
        if (z >= 10 && z <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositiveNumber(int positiveNum) {
        if (positiveNum < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }

    public static boolean checkPositiveNumberBool(int positiveNum) {
        return positiveNum < 0;
    }

    public static void halloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(float year) {
        if (year/400 == (int)year/400f) {
            System.out.println("Это високосный год!");
        } else if (year/100 == (int)year/100f){
            System.out.println("Это же обычный год...");
        } else if (year/4 == (int)year/4f) {
            System.out.println("Это високосный год!");
        } else System.out.println("Это же обычный год...");
    }

}

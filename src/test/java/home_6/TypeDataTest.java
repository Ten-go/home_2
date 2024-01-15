package home_6;


public class TypeDataTest {
    public static final int A = 11;
    public static final int B = 5;

    public static void main(String[] args) {
        mathOperators();
        logicOperators();
        overflow();
        combination();
    }

    public  static void mathOperators() {
        System.out.println("a = "+A);
        System.out.println("b = "+B);
        System.out.println("Математические операции:");
        System.out.println("Сумма: a + b = " + (A + B));
        System.out.println("Разность: a - b = " + (A - B));
        System.out.println("Умножение: a * b = " + (A * B));
        System.out.println("Деление: a / b = " + (A / B));
        System.out.println("Остаток от деления: a % b = " + (A % B));
        System.out.println();
    }

    public static void logicOperators() {
        System.out.println("a = "+A);
        System.out.println("b = "+B);
        System.out.println("Логические операции:");
        System.out.println("(a == b) - " + (A == B));
        System.out.println("(a != b) - " + (A != B));
        System.out.println("(a > b) - " + (A > B));
        System.out.println("(a < b) - " + (A < B));
        System.out.println("(b >= a) - " + (B >= A));
        System.out.println("(b <= a) - " + (B <= A));
        System.out.println();
    }

    public static void overflow() {
        int maxInt = Integer.MAX_VALUE;
        int exceedInt = maxInt + 1;
        byte firstByte = 127;
        byte secondByte = 1;
        byte exceedIntByte = (byte) (firstByte + secondByte);

        System.out.println("Переполнение:");
        System.out.println("Переполнение MAX_VALUE: " + exceedInt);
        System.out.println("Переполнение Byte: " + exceedIntByte);
        System.out.println();
    }

    public static void combination() {
        double c = 5/2;
        System.out.println("a = "+A);
        System.out.println("c = "+c);

        double sumDouble = A + c;
        double differenceDouble = A - c;
        double productDouble = A * c;
        double quotientDouble = A / c;

        int sumInt = (int) (A + c);
        int differenceInt = (int) (A - c);
        int productInt = (int) (A * c);
        int quotientInt = (int) (A / c);

        System.out.println("Выполнение операций между int и double приведенные к double");
        System.out.println("Сумма: " + sumDouble);
        System.out.println("Разность: " + differenceDouble);
        System.out.println("Произведение: " + productDouble);
        System.out.println("Частное: " + quotientDouble);
        System.out.println("Выполнение операций между int и double приведенные к int");
        System.out.println("Сумма: " + sumInt);
        System.out.println("Разность: " + differenceInt);
        System.out.println("Произведение: " + productInt);
        System.out.println("Частное: " + quotientInt);
    }
}
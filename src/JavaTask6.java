import java.util.Scanner;

public class JavaTask6 {
  public static void main(String[] args) {
    System.out.println("Введите x =");

    Scanner consoleScanner = new Scanner(System.in);
    int numX = consoleScanner.nextInt();

    System.out.println("Введите y =");
    int numY = consoleScanner.nextInt();

    System.out.println("Введите z =");
    int numZ = consoleScanner.nextInt();

    double avg = (numX + numY + numZ) / 3.0;
    int res = (int)(avg / 2);

    System.out.println("Среднее арифметическое = " + avg);

    if (res > 3) {
      System.out.println("Деление на 2 без остатка = " + res + " > 3");
      System.out.println("Программа выполнена корректно");
    } else {
      System.out.println("Деление на 2 без остатка = " + res + " <= 3");
    }
  }
}

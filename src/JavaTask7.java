import java.util.Scanner;

public class JavaTask7 {
  public static void main(String[] args) {
    System.out.println("Введите число");
    final int X = 4;
    final int Y = 7;
    final int Z = 2;

    Scanner consoleScanner = new Scanner(System.in);
    int digit = consoleScanner.nextInt();

    switch (digit){
      case X:
      case Y:
      case Z:
        System.out.println("Данное значение имеется в константах");
        break;
      default:
        System.out.println("Такой константы нет");
    }
  }
}
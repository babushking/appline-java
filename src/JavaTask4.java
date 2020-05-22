import java.util.Scanner;
public class JavaTask4 {

  public static void main(String[] args) {
    Scanner consoleScanner = new Scanner(System.in);

    System.out.println("Введите число в бинарном формате");

    String bin = consoleScanner.nextLine();

    int decimal = Integer.parseInt(bin, 2);

    System.out.println("Ответ: " + decimal);

  }
}

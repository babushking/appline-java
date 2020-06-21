import java.util.Scanner;

public class FinalTask1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число в бинарном формате: ");
    String binary = scanner.nextLine();
    if (!validate(binary)) {
      System.out.println("Ошибка ввода, допустимо только 0 и 1");
    } else {
      int result = convert(binary);
      System.out.println("Число в десятичной системе: " + result);
    }

  }

  public static boolean validate (String binary) {
    boolean result = true;
    for (int i = binary.length() - 1; i >= 0; i-- ) {
      char current = binary.charAt(i);
      if (current != '0' && current != '1') {
        result = false;
      }
    }
    return result;
  }


  public static int convert (String binary) {
    int result = 0;
    for (int i = binary.length() - 1; i >= 0; i-- ) {
      int current = Character.getNumericValue(binary.charAt(i));
      result += current * Math.pow(2, binary.length() - i - 1);
    }
    return result;
  }

}
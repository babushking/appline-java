import java.util.Scanner;
public class FinalTask3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите курс доллара (пр. 62,40): ");
    double rate = scanner.nextDouble();

    System.out.println("Введите колличество рублей ");
    double amount = scanner.nextDouble();

    double result = convert(rate, amount);
    System.out.println("Колличество долларов: " + result);

  }

  public static double convert (double rate, double amount) {
    return Math.round(amount / rate * 100) / 100.0;
  }
}
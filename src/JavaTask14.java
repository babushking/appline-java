import java.util.Scanner;

public class JavaTask14 {
  public static void main(String[] args) {

    Scanner text = new Scanner(System.in);
    System.out.println("Введите целое число");
    String S = text.nextLine();

    int X = Integer.parseInt(S, 10);
    double Y = (double) X;

    System.out.println(S);
    System.out.println(X);
    System.out.println(Y);
  }
}
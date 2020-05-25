import java.util.Scanner;

public class JavaTask12 {
  public static void main(String[] args) {

    Scanner text = new Scanner(System.in);
    System.out.println("Введите текст");
    String sentence = text.nextLine();

    String b = sentence.replaceAll(" ", "");
    System.out.println(b);
  }
}

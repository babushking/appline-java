import java.util.Scanner;

public class JavaTask13 {
  public static void main(String[] args) {

    Scanner text = new Scanner(System.in);
    System.out.println("Введите текст");
    String a = text.nextLine();

    System.out.println("Введите еще одну строку для сравнения");
    String b = text.nextLine();

    if (a.length() == b.length() ) {
      System.out.println("Длины строк равны");
    }
      else if (a.length() > b.length() ) {
        System.out.println(a);
      }
        else {
          System.out.println("В результате сравнения длиннее оказалась строка:  "  + b );
        }
  }
}
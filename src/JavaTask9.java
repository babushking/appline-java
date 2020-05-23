import java.util.Scanner;

public class JavaTask9 {
  public static void main(String[] args) {

    Scanner massiv = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int length = massiv.nextInt();
    int[] box = new int[length];

    System.out.println("Введите элементы массива:");
    for (int i = 0; i < length; i++) {
      box[i] = massiv.nextInt();
    }
    System.out.print ("Создан массив (x2):");
    for (int i = 0; i < length; i++) {
            System.out.print (" " + box[i] * 2);
    }
  }
}

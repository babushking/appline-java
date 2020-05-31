import java.util.Arrays;
import java.util.Scanner;

public class JavaTask15 {
  public static void main(String[] args) {

    Scanner massiv = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int length = massiv.nextInt();
    int[] box = new int[length];

    System.out.println("Введите элементы массива:");
    for (int i = 0; i < length; i++) {
      box[i] = massiv.nextInt();
    }
    System.out.print("Создан массив :");
    for (int i = 0; i < length; i++) {
      System.out.print(" " + box[i]);
    }
  }

      public static void bubbleSort (int[] sortBox) {
        for (int p = sortBox.length - 1; p > 0; p--) {
          for (int i = 0; i < p; i++) {

            if (sortBox[i] > sortBox[i + 1]) {
              int tmp = sortBox[i];
              sortBox[i] = sortBox[i + 1];
              sortBox[i + i] = tmp;
              System.out.print(sortBox[i]);
            }
          }
        }
      }
}


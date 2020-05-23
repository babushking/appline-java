import java.util.Arrays;
import java.util.Scanner;

public class JavaTask10 {
  public static void main(String[] args) {

    Scanner massiv = new Scanner(System.in);
    System.out.println("Введите количество строк в матрице: ");
    int length = massiv.nextInt();

    System.out.println("Введите количество столбцов в матрице: ");
    int width = massiv.nextInt();
    int[][] box = new int[length][width];

    System.out.println("Введите элементы матрицы:");
    for (int i = 0; i < box.length; i++) {
      for (int q = 0; q < box[i].length; q++)
      box[i][q] = massiv.nextInt();
    }

    System.out.print ("Первая строка матрицы (x3) имеет вид:");
    for (int q = 0; q < width; q++) {
      System.out.print (" " + box[0][q] * 3);
    }
  }
}

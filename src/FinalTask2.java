import java.util.Scanner;


public class FinalTask2 {
  public static void main(String[] args) {

    Scanner massiv = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int length = massiv.nextInt();
    int[] box = new int[length];

    System.out.println("Введите элементы массива:");
    for (int i = 0; i < length; i++) {
      box[i] = massiv.nextInt();
    }
    System.out.println("Создан массив :");
    printArray(box);
    insertSort(box);
  }

  public static void printArray (int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }
    System.out.println(" ");
  }

  public static void insertSort (int[] arr) {
    System.out.println("началась сортировка...");

    int i;
    int current;

    for (int j = 1; j < arr.length; j++) {
      current = arr[j];
      i = j - 1;
        while (i >= 0 && arr[i] > current) {
        arr[i] = current;
        arr[i + 1] = arr[i];
        i--;
      }
    }

    System.out.println("Отсортированный массив:");
    printArray(arr);
  }
}
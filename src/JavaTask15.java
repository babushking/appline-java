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
    System.out.println("Создан массив :");
    printArray(box);
    bubbleSort(box);
  }

  public static void printArray (int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }
    System.out.println(" ");
  }

  public static void bubbleSort (int[] arr) {
    System.out.println("началась сортировка...");

    for (int p = arr.length - 1; p > 0; p--) {
      int counter = 0;
      System.out.println("p= " + p);
      for (int i = 0; i < p; i++) {
        System.out.println("i= " + i);
        if (arr[i] > arr[i + 1]) {
          counter++;
          System.out.println(arr[i] + ">" + arr[i + 1]);
          int tmp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = tmp;
        } else {
          System.out.println(arr[i] + "<=" + arr[i + 1]);
        }
        printArray(arr);
      }
      System.out.println("Количество замен =  " + counter);
      if (counter == 0) {
        break;
      }
    }
    System.out.println("Отсортированный массив:");
    printArray(arr);
  }
}


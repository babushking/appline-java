import java.io.*;

class JavaTask16 {
  public static void main(String[] args){
    String s;

    try (BufferedReader br = new BufferedReader(new FileReader ("D://Program Files//загрузки//задание 1.txt"))) {
      while ((s = br.readLine()) != null) {
        System.out.println(s);
      }
    } catch (IOException exc) {
      System.out.println("Ошибка ввода-вывода: " + exc);
    }
  }
}

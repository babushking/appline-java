import java.io.*;

class JavaTask18 {
  public static void main(String[] args) {
    String s;

    try (BufferedReader br = new BufferedReader(new FileReader("D://Program Files//загрузки//задание 1.txt"))) {
      while ((s = br.readLine()) != null) {
        System.out.println(s);
      }
    } catch (IOException exc) {
      System.out.println("Ошибка ввода-вывода: " + exc);
    }


    String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите текст для записи в файл. Признак окончания ввода-строка 'stop'");
    try (FileWriter fw = new FileWriter("D://Program Files//загрузки//задание 1.txt")) {
      do {
        System.out.print("^");
        str = br.readLine();

        if (str.compareTo("stop") == 0) break;

        str = str + "\r\n";
        fw.write(str);

      } while (str.compareTo("stop") != 0);
    } catch (IOException exc) {
      System.out.println("Ошибка ввода-вывода: " + exc);
    }
  }
}

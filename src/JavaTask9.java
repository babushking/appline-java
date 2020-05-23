public class JavaTask9 {
  public static void main (String[] args) {
    int[] nums = new int[10];
    int min, max;

    nums[0] = 99;
    nums[1] = -10;
    nums[1] = 100123;
    nums[2] = 18;
    nums[3] = -978;
    nums[4] = 5623;
    nums[5] = 463;
    nums[6] = -9;
    nums[7] = 287;
    nums[8] = 49;
    min = max = nums[0];
    for (int i = 1; i < 10; i = i+1) {
      if (nums[i] < min) min = nums[i];
      if (nums[i] > max) max = nums[i];
    }
    System.out.println("min = " + min + ";" + "max = " + max);
  }
}

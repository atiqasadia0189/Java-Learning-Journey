import java.util.Arrays;
public class ArraysPractice {
  public static void main(String[] args) {
    // 1D Arrays
    int[] marks = {90, 95, 97};
    System.out.println(marks[1]);
    // Arrays length
    System.out.println(marks.length);
    // 2D Arrays 
    int[][] marks1 = {{92,95,93}, {89,78,85}};
    System.out.println(marks1[0][1]);
    // Arrays Sorting
    Arrays.sort(marks);
    System.out.println(marks[0]);
  }
}

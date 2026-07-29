public class ExceptionHandling {
  public static void main(String[] args) {
    int[] a = {95, 89, 78};
    try {
      System.out.println(a[5]);
    } catch (Exception exception){
      System.out.println(a[0]);
    }
  }
}

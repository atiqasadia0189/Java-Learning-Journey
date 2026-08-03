// String Functions
public class StringFunctions {
  public static void main(String[] args) {
   String name = "Atiqa";
   String name1 = "Sadia";
    // String Concatination
   String name2 = name + " " + name1;
   System.out.println(name2);
   // String length
    System.out.println(name.length());
    System.out.println(name1.length());
   // String Replacement
    String name3 = name1.replace("d", "f");
    System.out.println(name3);
   // String CharaAt
    System.out.println(name.charAt(0));
    System.out.println(name1.charAt(1));
   // String Substrings
    System.out.println(name.substring(0, 3));
  }
}

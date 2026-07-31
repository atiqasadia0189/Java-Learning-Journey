// Java OOPs Basics with functions
public class JavaOopsBasics{
  String name;
  int roll_no;
  String Address;

  public void printdata(){
    System.out.println(name);
    System.out.println(roll_no);
    System.out.println(Address);
  }
public static void main(String[] args){
  JavaOopsBasics std1 = new JavaOopsBasics();
  std1.name = "Atiqa";
  std1.roll_no = 123;
  std1.Address = "Lahore, Pakistan";
  JavaOopsBasics std2 = new JavaOopsBasics();
  std2.name = "Sadia";
  std2.roll_no = 321;
  std2.Address = "Pakistan";
  std1.printdata();
  std2.printdata();
  }
 }

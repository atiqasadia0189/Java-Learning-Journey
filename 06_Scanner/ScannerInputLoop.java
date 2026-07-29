import java.util.Scanner;
public class ScannerInputLoop{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int number = 0;
   do {
    System.out.println("Input Your Number");
    number = sc.nextInt();
    System.out.print("Here is your number");
    System.out.println(number);
   } while(number >= 0);
   System.out.println("THE END");
}
}

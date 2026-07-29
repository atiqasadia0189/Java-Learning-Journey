public class ContinueBreak{
 public static void main(String[] args){
  int a = 0;
  while(true){
    if(a == 3){
      a = a + 1;
      continue;
    }
    System.out.println(a);
    a = a + 1;
    if(a > 5){
      break;
   }
  }
 }
}

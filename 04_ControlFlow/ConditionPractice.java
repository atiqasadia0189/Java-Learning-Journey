// Java If-Else Conditions Practice 
public class ConditionPractice {
  public static void main(String[] args) {
    int age = 30;
    int age1 = 40;
    int age2 = 60;
    boolean isRaining = true;
    // Check Adult or not adult
  if(age >= 18) {
    System.out.println("Adult");
  } 
   else {
     System.out.println("not-adult");
   }
    // Logical AND Condition
    if(age < 50 && age1 < 50){
      System.out.println("Both less than 50");
    }
     // Logical OR Condition
    if(age < 50 || age2 < 50){
      System.out.println("Atleast one less than 50");
    }
    // Logical NOT Condition
    if(!isRaining){
      System.out.println("It is not raining");
    }
  }
}

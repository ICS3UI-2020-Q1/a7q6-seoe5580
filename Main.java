/**
 * This program will use a method where if you only have a odd digit in your integer it will return turn but if you have any even digit in your integer it will return false
 * @author Eric Seo
 */
public class Main {
  
  // creates method using boolean return type and whenever the digits are even it will return false otherwise it will return true
  public static boolean allDigitsOdd(int num){
    int remainder = 0;
    while(num >= 1){
      remainder = num % 10;
      num = num / 10;
      if(remainder % 2 == 0){
        return false;
      }
    }
    return true;
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // This creates a boolean variable so that it could be in a printoutable
    boolean answer = allDigitsOdd(9145293);
    // This prints out either true or false depending on the method's calculation on the number
    System.out.println(answer);
  }
}

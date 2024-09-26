import java.util.Scanner; // import the scanner class

public class Main {

   public static void main(String []args) {
      System.out.println("Testing methods that RETURN vaules...");

      //Construct a Scanner object
      // System.in() is the computer's keyboard
      Scanner scan = new Scanner(System.in);

      //Take input with the Scanner methods
      System.out.println("Enter some text ");
      String imputStr = scan.nextLine();
      System.out.println("Enter a whole number: ");
      int imputInt = scan.nextInt();
      System.out.println("Enter a decimal number: ");
      double imputDouble = scan.nextDouble();
      
      //Handle the user imput (do something with teh values)
      //Use it in a print statment 
      System.out.println("You entered: " + imputStr);
      //Use vaules in an expression
      int sum = inputInt + inputDouble;


      
   }
}

import java.util.Scanner; // import the scanner class

public class Main {

   public static void main(String []args) {
      System.out.println("Testing methods that RETURN vaules...");

      //Construct a Scanner object
      // System.in() is the computer's keyboard
      Scanner scan = new Scanner(System.in);

      //Take input with the Scanner methods
     // System.out.println("Enter some text ");
     // String imputStr = scan.nextLine();
     // System.out.println("Enter a whole number: ");
      //int imputInt = scan.nextInt();
      //System.out.println("Enter a decimal number: ");
      //double imputDouble = scan.nextDouble();
      
      //Handle the user imput (do something with teh values)
      //Use it in a print statment 
      //System.out.println("You entered: " + imputStr);
      //Use vaules in an expression
      //int sum = inputInt + inputDouble;

      // ***STRING CLASS***
      // Original way of construcing a string object
      String message = new String("APCS is awesome!");
      // Shortcut (common) way of creating a string
      String greeting = "Hello coders!"; // text in quotes is a "string literal"
      
      // Concatenate (combine) two or more String objects
      String concatenated = greeting + message;
      System.out.println(concatenated);
      System.out.println(greeting + " " + message);
      // can conmbine string variables and "String literals"

      //Numebers get converted to string
      System.out.println("I am" + 28 + "years old");
      System.out.println("12" + 4 + 3); // 1243
      System.out.println("12" + (4 + 3)); // 127
      System.out.println(("12") + 4 + 3); // 1243
      System.out.println(12 + 4 + 3); // Not concatenations, just additon






      
   }
}

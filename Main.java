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
      System.out.println("I am " + 28 + " years old");
      System.out.println("12" + 4 + 3); // 1243
      System.out.println("12" + (4 + 3)); // 127
      System.out.println(("12") + 4 + 3); // 1243
      System.out.println(12 + 4 + 3); // Not concatenations, just additon

      // *** STRING METHODS ***
      // .length () returns number of characters
      int messageLength = message.length();
      System.out.println("Length: " + messageLength);
      // .length()-1 represents final index
      System.out.println("Final Index: " + (message.length()-1));

     // .substring(int,int) return a string from first indec to second 
      //not including the character at the second index
      String firstWord = message.substring(0,4);
      System.out.println(firstWord);
      
      //.substring(int) returns a string forom first index to end of string
      String lastWord = message.substring(8);
      System.out.println(lastWord);

      //.indexOf(String) returns an int representing the index or postition of the String argument passed in
      int indexOfAwesome = message.indexOf("awesome");
      System.out.println(indexOfAwesome);
      
      //not on Ap exam but useful
      System.out.println(message.toUpperCase());
      System.out.println(message.toLowerCase());

      //.equals comapres a parameter String to the calling String object
      //then returns a boolean representing whether theya re EQUAL
      String s1 = "I am tired";
      String s2 = "Im is almost the weekend";

      boolean isEqual = s1.equals(s2);
      System.out.println(isEqual);
      boolean isEqualAgain = s1.equals("I am tired");
      System.out.println(isEqualAgain);

      String a = "ape";
      String z = "zebra";

      //.compareTo returns a positive integer if this string > other string
      // returns a negative integer if this string < other string
      System.out.println(a.compareTo(z)); //-25
      System.out.println(z.compareTo(a)); //25






      
   }
}

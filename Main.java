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

      // ** MATH CLASS METHODS **
      // Do NOT need to construct a Math OBJECT to use

      int absVal = Math.abs(-273);
      System.out.println(absVal);

      double absValDoub = Math.abs(-2.5);
      System.out.println(absValDoub);

      //Math.pow(double, double) return the first double raised to the power of the second double provided
      double cubed = Math.pow(38,3);
      System.out.println(cubed);

      // Math.sqrt(double) returns the square rort of the input
      double squareRoot = Math.sqrt(49);
      System.out.println(squareRoot);

      //Math.random() returns a random double 
      System.out.println("Random number; " + Math.random());

      // Modify the range of output from Math.random
      // Mutlipy output to increase end point of range
      double rand = Math.random() * 100;
      System.out.println(rand);

      // Add to output to increase starting point
      double rand2 = Math.random() * 100 + 1;
      System.out.println(rand2);

      // Cast to an int if you want a random whole number
      int randInt = (int) (Math.random() * 10 + 1);
      System.out.println(randInt);








      
   }
}


/**
 * Name of Assignment : Java String Operations
 * Author : Seerat Sandha
 * Date : 03/02/2023
 */
 
import java .util.Scanner;
public class StringOperations
{
    public static void main(String[]args)
{    System.out.println("Enter the String:");
     Scanner scnr =  new Scanner(System.in);
     String userInput = scnr.nextLine();
       
     /// FIRST PART///
     
     
      String lowerCase = userInput.toLowerCase();  // method (.toLowerCase()) use to convert String to lower case.
      System.out.println("The string in lower case is:" +"\n"+ lowerCase);
      
      String upperCase = userInput.toUpperCase();  // use .toUpperCase to convert Upper Case.
      System.out.println("The string in upper case is:" +"\n"+upperCase);
       
    int count =0;
    int whitespace =0;
    
     for(int i =0; i <userInput.length(); i++) // use for loops to count the number of characters and tokens in string
    {
          count++;
    } 
     for(int j =0; j < userInput.length(); j++) 
    {
               if(Character.isWhitespace(userInput.charAt(j)))
               {
                   whitespace = whitespace+1;
                   
                   
               }
     }
     whitespace+=1;
     
   
    System.out.println("The number of characters in the string is "+count+" and it contains "+ whitespace+" tokens ");
    
    
    /// SECOND PART///
    
    
    System.out.println("\n"+"Enter a starting position between 0 and " + count);
    int startingPoint = scnr.nextInt();
    
    System.out.println("Enter an ending position between " + startingPoint +" and " + count);
    int endingPoint= scnr.nextInt();
     
    
    System.out.println("The character at position "+ startingPoint+" is : " + userInput.charAt(startingPoint));
    System.out.print("The string between position "+startingPoint +" and "+ endingPoint +" is: " );
    endingPoint+=1;
    System.out.println(userInput.substring(startingPoint,endingPoint) +"\n"); // use substring method to extract 
                                                                             // a part of a string.
    
    /// THIRD PART///
    
    System.out.println("\n"+"Enter a text in the string to be replaced : ");
    String strText = scnr.next();
    
    System.out.println("Enter a replacement text : ");
    String userText = scnr.next();
    System.out.println("Your new string is now :");
    System.out.println(userInput.replace(strText , userText)); 
    
    // replace method to replace a part of string with another
    
}
}


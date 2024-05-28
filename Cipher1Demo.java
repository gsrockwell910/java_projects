import java.util.*;

public class Cipher1Demo
{  
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String userString = "",
             encryptedString = "",
             decryptedString = "";
             
      int shuffle = 0;
      
      final int MAX_SHUFFLE = 130;
             
     //ArrayList<Character> oriCharList = new ArrayList<Character>();
     //ArrayList<Character> newCharList = new ArrayList<Character>();
             
      //prompt for user input
      System.out.print("Please enter a string to be encrypted: ");
      userString = keyboard.nextLine();
      
      System.out.print("Please enter a number: ");
      shuffle = keyboard.nextInt();
      
      while(shuffle > MAX_SHUFFLE)
      {
         System.out.println("ERROR: Please enter a number between 32 and 127. Try again: ");
         shuffle = keyboard.nextInt(); 
      }
      
      Cipher1 cipher = new Cipher1(shuffle);
      encryptedString = cipher.encrypt(userString);
      
      System.out.print("\nOriginal String: " + userString);
      System.out.print("\nEncrypted String: " +  encryptedString); 
   }
}
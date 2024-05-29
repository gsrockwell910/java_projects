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
             
      //prompt for user input
      System.out.print("Please enter a string to be encrypted: ");
      userString = keyboard.nextLine();
      
      System.out.print("Please enter a number: ");
      shuffle = keyboard.nextInt();
      
      Cipher1 cipher = new Cipher1(shuffle);
      encryptedString = cipher.encrypt(userString);
      
      System.out.print("\nOriginal String: " + userString);
      System.out.print("\nEncrypted String: " +  encryptedString); 
   }
}
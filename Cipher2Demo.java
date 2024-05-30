import java.util.*;

public class Cipher2Demo
{  
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String userString = "",
             encryptedString = "",
             decryptedString = "";
             
      int shift = 0;
             
      //prompt for user input
      System.out.print("Please enter a string to be encrypted: ");
      userString = keyboard.nextLine();
      userString.toLowerCase();
      
      System.out.print("Please enter a number: ");
      shift = keyboard.nextInt();

      keyboard.close();
      
      Cipher2 cipher = new Cipher2(shift);
      encryptedString = cipher.encrypt(userString);
      decryptedString = cipher.decrypt(encryptedString);
      
      System.out.print("\nOriginal String: " + userString);
      System.out.print("\nEncrypted String: " +  encryptedString);
      System.out.print("\nDecrypted String: " + decryptedString); 
   }
}
//for user input and ArrayList
import java.util.*;

public class Cipher1 implements Crypto
{
   private int shuffle;
   
   public Cipher1()
   {
      shuffle = 0;
   }
   
   public Cipher1(int shuff)
   {
      shuffle = shuff;
   }

   public String encrypt(String str)
   {
     final int ASCII_START = 32,
               ASCII_END = 127,
               CONV_FACT = 1;  
      
      char[] chars = str.toCharArray();
      
      str = "";
      
      //test
      for(char c : chars)
      {
         //int temp = 0;
         c += shuffle;
         
         if(c <= ASCII_START) //&& c >= ASCII_END)
         {
            c += ASCII_END - ASCII_START + CONV_FACT;
         }
         else if(c >= ASCII_END)
         {
            c = (char)((c - ASCII_START + shuffle) % (ASCII_END - ASCII_START + CONV_FACT) + ASCII_START);
         }
         //reassemble string
         str += c;
      }
      
      return str;
   }
   
   public String decrypt(String str)
   {
      return str;
   }
}
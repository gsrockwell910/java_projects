//caesar cipher
public class Cipher2 implements Crypto
{
   private int shift;
   private final int CONV_FACT = 26;
   
   public Cipher2()
   {
      shift = 0;
   }
   
   public Cipher2(int shift)
   {
      this.shift = shift;
   }
   
   public String encrypt(String str)
   {
      StringBuilder encryptedString = new StringBuilder();
      
      str = str.toLowerCase();
      
      for(int i = 0; i < str.length(); i++)
      {
         char c = str.charAt(i);
         
         if( Character.isLetter(c) )
         {
            c = (char)((c - 'a' + shift + CONV_FACT) % CONV_FACT + 'a');
         }
         encryptedString.append(c);
      }
      return encryptedString.toString();
   }
   
   public String decrypt(String str)
   {
      StringBuilder decryptedString = new StringBuilder();
      
      str = str.toLowerCase();
      
      for(int i = 0; i < str.length(); i++)
      {
         char c = str.charAt(i);
         
         if( Character.isLetter(c) )
         {
            c = (char)((c - 'a' - shift + CONV_FACT) % CONV_FACT + 'a');
         }
         decryptedString.append(c);
      }
      return decryptedString.toString();
   }
}
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
      char[] chars = str.toCharArray();
      
      str = "";
      
      for(char c : chars)
      {
         c += shuffle;
         str += c;
      }
      
      return str;
   }
   
   public String decrypt(String str)
   {  
   
      char[] chars = str.toCharArray();

      str = "";

      for (char c : chars)
      {
         c -= shuffle;
         str += c; // Reassemble string
        
      }
      return str;
   }
}
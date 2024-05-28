//for user input and ArrayList
import java.util.*;

public class Cipher1 implements Crypto
{
   private ArrayList<Character> oriCharList;
   private ArrayList<Character> newCharList;
   private int shuffle;
   
   public Cipher1(ArrayList<Character> list1, ArrayList<Character> list2, int shuff)
   {
      oriCharList = new ArrayList<Character>(list1);
      newCharList = new ArrayList<Character>(list2);
      shuffle = shuff;
   }
   
   public Cipher1()
   {
      oriCharList = new ArrayList<Character>();
      newCharList = new ArrayList<Character>();
      shuffle = 0;
   }
   
   public Cipher1(int shuff)
   {
      oriCharList = new ArrayList<Character>();
      newCharList = new ArrayList<Character>();
      shuffle = shuff;
   }


   
   public String encrypt(String str)
   {
     final int ASCII_START = 32,
               ASCII_END = 127;  
               
     int index = 0; 
      
      //split string and add to arraylist
      for(int i = 0; i < str.length(); i++)
      {
         oriCharList.add( str.charAt(i) );
      }
      
      str = "";
      
      //test
      for(char c : oriCharList)
      {
         c += shuffle;
         
         if(c >= ASCII_END)
         {
            c -= (ASCII_END - ASCII_START);
            c += shuffle;
         }
         else if(c <= ASCII_START)
         {
            c += (ASCII_END - ASCII_START);
            c -= shuffle;
         }
         newCharList.add(c);
      }
      
      //test
      for(int i = 0; i < newCharList.size(); i++)
      {
         str += newCharList.get(i);
      }
      
      return str;
   }
   
   public String decrypt(String str)
   {
      return str;
   }
}
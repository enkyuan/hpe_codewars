package vowel_count;

public class Vowels {

    public static int getCount(String str) {
      int counter = 0;
      String[] vowels = new String[] {"a", "e", "i", "o", "u"};
      for (int i = 0; i < str.length(); i++) {
          for (int j = 0; j < vowels.length; j++) {
                if (str.substring(i, i + 1).equals(vowels[j])) 
                    counter++;
          }
      }
      return counter;
    }
  
}
package create_phone_number;

public public class PhoneNumbers {
    public static String createPhoneNumber(int[] numbers) {
      // Your code here!
      String str = "";
      for(int i = 0; i < numbers.length; i++) {
          str += numbers[i];
      }
      
      String firstThree = str.substring(0, 3);
      String secondThree = str.substring(3, 6);
      String lastFour = str.substring(6, 10);
      
      return "(" + firstThree + ")" + " " + secondThree + "-" + lastFour;
    }
} 


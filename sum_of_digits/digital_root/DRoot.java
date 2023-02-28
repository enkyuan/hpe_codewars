public class DRoot {
  public static int digital_root(int n) {
    // ...
    int result = 0;
    int secondSum = 0;
    while (n != 0) {
        result += n % 10;
        n /= 10;
    }
    
    if (result > 10) {
        secondSum += (result % 10) + (result / 10);
      
        if (secondSum >= 10) {
          secondSum = (secondSum % 10) + (secondSum / 10);  
        }   
      
        return secondSum;
    }
    
    return result;
  }
}
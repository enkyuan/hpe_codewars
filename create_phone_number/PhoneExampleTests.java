package create_phone_number;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneExampleTests {
  @Test
  public void tests() {
    assertEquals("(123) 456-7890", PhoneNumbers.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
  }
}
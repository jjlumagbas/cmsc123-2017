import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class BookTest extends TestCase {
 
  public void testSameAuthorSame() {
    Author hawking = new Author("Stephen Hawking", "M");
    Author rowling = new Author("J.K. Rowling", "F");
    
    Book time = new Book(hawking, "A Brief History of Time");
    Book stone = new Book(rowling, "The Sorcerer's Stone");
    
    assertEquals(false, time.sameAuthor(stone));
  }
  
  public void testSameAuthorNotSame() {
    Author rowling = new Author("J.K. Rowling", "F");
    
    Book stone = new Book(rowling, "The Sorcerer's Stone");
    Book secrets = new Book(rowling, "The Chamber of Secrets");
    
    assertEquals(true, secrets.sameAuthor(stone));
  }
}

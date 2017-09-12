import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class PointTest extends TestCase {
  
  public void testTranslateUpRight() {
    Point a = new Point(1, 1);
    
    Point b = a.translate(1, 1); // expect Point(2, 2)
    
    assertEquals(2, b.x);
    assertEquals(2, b.y);
  }
  
  public void testTranslateDownLeft() {
    Point a = new Point(1, 1);
    
    Point b = a.translate(-1, -1); // expect Point(0, 0)
    
    assertEquals(0, b.x);
    assertEquals(0, b.y);
  }
  
}

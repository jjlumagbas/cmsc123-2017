import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class CircleTest extends TestCase {
  
  public void testTranslateUpRight() {
    Point a = new Point(1, 1);
    
    Circle c = new Circle(a, 5);
    
    Circle d = c.translate(1, 1);
    
    assertEquals(2, d.p.x);
    assertEquals(2, d.p.y);
  }
  
}
